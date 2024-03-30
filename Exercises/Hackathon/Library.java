import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library implements Serializable {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(String isbn) throws BookNotFoundException{
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                books.remove(i);
                return true; 
            }
        }
        throw new BookNotFoundException("No book found with ISBN: " + isbn);
    }

    public List<Book> searchBooks(String query) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(query) ||
                book.getAuthor().contains(query) ||
                book.getGenre().contains(query)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public boolean checkOutBook(String isbn) throws BookNotFoundException, BookNotAvailableException{
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isAvailable()){
                    throw new BookNotAvailableException("Book wit ISBN " + isbn + " is not available for checkout.");
                }
                book.setAvailable(false);
                return true; 
            }
        }
        throw new BookNotFoundException("No book found with ISBN: " + isbn);
    }

    public boolean returnBook(String isbn) throws BookNotFoundException{
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if(!book.isAvailable()){
                    book.setAvailable(true);
                    return true; 
                }else{
                    System.out.println("Book with ISBN "+ isbn+ " is already available.");
                    return false;
                }
            }
        }
        throw new BookNotFoundException("No book found with ISBN: " + isbn);
    }

    // Serialization
    public void saveLibrary(String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(this);
        }
    }

    // Deserialization
    public static Library loadLibrary(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (Library) in.readObject();
        }
    }

    
    public void sortBooksByTitle() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

    public void sortBooksByAuthor() {
        Collections.sort(books, Comparator.comparing(Book::getAuthor));
    }

    public void sortBooksByGenre() {
        Collections.sort(books, Comparator.comparing(Book::getGenre));
    }
}


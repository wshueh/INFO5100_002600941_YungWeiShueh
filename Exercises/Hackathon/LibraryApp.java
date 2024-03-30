import java.io.*;
import java.util.List;



public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        //Adding books
        library.addBook(new Book("Harry Potter", "J.K. Rowling", "Fantasy", "88888"));
        library.addBook(new Book("The Silver Linings Playbook", "Matthew Quick", "Comedy", "123456"));
        library.addBook(new Book("Dune", "Frank Herbert", "Fiction", "87654321"));
        library.addBook(new Book("The Lord", "Tom Dickson", "Romance", "1111666"));


        //Display all available books
        System.out.println("Available books:");
        library.displayAvailableBooks();

        //Searching by title
        System.out.println("\nSearching for a book with title:");
        List<Book> searchResults = library.searchBooks("The Silver Linings Playbook");
        for (Book book : searchResults) {
            System.out.println(book);
        }

        //Searching by author
        System.out.println("\nSearching for books by author:");
        searchResults = library.searchBooks("J.K. Rowling");
        for (Book book : searchResults) {
            System.out.println(book);
        }

        //Searching by genre
        System.out.println("\nSearching for books by genre:");
        searchResults = library.searchBooks("Fantasy");
        for (Book book : searchResults) {
            System.out.println(book);
        }


        //Checking out a book
        try {
            System.out.println("\nAttempting to check out Harry Potter:");
            library.checkOutBook("88888");
            System.out.println("Checked out successfully!");
        } catch (BookNotFoundException | BookNotAvailableException e) {
            System.err.println("Error during checkout: " + e.getMessage());
        }

        library.displayAvailableBooks();


        //Returning a book
        try {
            System.out.println("\nAttempting to return Harry Potter: ");
            library.returnBook("88888"); 
            System.out.println("Returned successfully!");
        } catch (BookNotFoundException e) {
            System.err.println("Error during return: " + e.getMessage());
        }

        library.displayAvailableBooks();


        // Sort and display books by title
        System.out.println("\nBooks sorted by title:");
        library.sortBooksByTitle();
        library.displayAvailableBooks();


        // Sort and display books by author
        System.out.println("\nBooks sorted by author:");
        library.sortBooksByAuthor();
        library.displayAvailableBooks();


        // Sort and display books by genre
        System.out.println("\nBooks sorted by genre:");
        library.sortBooksByGenre();
        library.displayAvailableBooks();       


        //Save and load library data
        try {
            library.saveLibrary("libraryData.ser");
            Library loadedLibrary = Library.loadLibrary("libraryData.ser");
            System.out.println("\nLoaded library data:");
            loadedLibrary.displayAvailableBooks();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


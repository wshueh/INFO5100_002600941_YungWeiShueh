package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.StringReader;
import org.xml.sax.InputSource;

public class Main {

    //JSON string
    private static final String jsonString = "{ \"BookShelf\": [ { \"title\": \"The Little Prince\", \"publishedYear\": 1943, \"numberOfPages\": 100, \"authors\": [\"Antoine de Saint-Exupéry\"] }, { \"title\": \"The Woman in Me\", \"publishedYear\": 2023, \"numberOfPages\": 350, \"authors\": [\"Britney Spears\"] }, { \"title\": \"The Perks of Being a Wallflower\", \"publishedYear\": 1999, \"numberOfPages\": 240, \"authors\": [\"Stephen Chbosky\"] } ] }";

    //XML string
    private static final String xmlString = "<BookShelf> <Book> <title>The Little Prince</title> <publishedYear>1943</publishedYear> <numberOfPages>100</numberOfPages> <authors> <author>Antoine de Saint-Exupéry</author> </authors> </Book> <Book> <title>The Woman in Me</title> <publishedYear>2023</publishedYear> <numberOfPages>350</numberOfPages> <authors> <author>Britney Spears</author> </authors> </Book> <Book> <title>The Perks of Being a Wallflower</title> <publishedYear>1999</publishedYear> <numberOfPages>240</numberOfPages> <authors> <author>Stephen Chbosky</author> </authors> </Book> </BookShelf>";

    public static void main(String[] args) throws Exception {
        System.out.println("XML Parsing and Printing:");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document xmlDocument = dBuilder.parse(new InputSource(new StringReader(xmlString)));
        xmlDocument.getDocumentElement().normalize();

        NodeList xmlBooks = xmlDocument.getElementsByTagName("Book");
        printXmlBooks(xmlBooks);

        // Add new XML Book
        addNewXmlBook(xmlDocument);
        System.out.println("\nAfter adding new XML Book:");
        printXmlBooks(xmlDocument.getElementsByTagName("Book"));

        System.out.println("\nJSON Parsing and Printing:");
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray jsonBooks = jsonObject.getJSONArray("BookShelf");
        printJsonBooks(jsonBooks);

        // Add new JSON Book
        addNewJsonBook(jsonBooks);
        System.out.println("\nAfter adding new JSON Book:");
        printJsonBooks(jsonBooks);
    }

    private static void printXmlBooks(NodeList books) {
        for (int i = 0; i < books.getLength(); i++) {
            Node node = books.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Title: " + element.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Published Year: " + element.getElementsByTagName("publishedYear").item(0).getTextContent());
                System.out.println("Number of Pages: " + element.getElementsByTagName("numberOfPages").item(0).getTextContent());
                NodeList authorList = element.getElementsByTagName("author");
                System.out.print("Authors: ");
                for (int j = 0; j < authorList.getLength(); j++) {
                    System.out.print(authorList.item(j).getTextContent());
                    if (j < authorList.getLength() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("\n");
            }
        }
    }


    private static void addNewXmlBook(Document document) {
        Element newBook = document.createElement("Book");

        Element title = document.createElement("title");
        title.appendChild(document.createTextNode("YOU"));
        newBook.appendChild(title);

        Element year = document.createElement("publishedYear");
        year.appendChild(document.createTextNode("2024"));
        newBook.appendChild(year);

        Element pages = document.createElement("numberOfPages");
        pages.appendChild(document.createTextNode("500"));
        newBook.appendChild(pages);

        Element authors = document.createElement("authors");
        Element author = document.createElement("author");
        author.appendChild(document.createTextNode("Caroline Kepnes"));
        authors.appendChild(author);
        newBook.appendChild(authors);

        document.getDocumentElement().appendChild(newBook);
    }

    private static void printJsonBooks(JSONArray books) {
        for (int i = 0; i < books.length(); i++) {
            JSONObject book = books.getJSONObject(i);
            System.out.println("Title: " + book.getString("title"));
            System.out.println("Published Year: " + book.getInt("publishedYear"));
            System.out.println("Number of Pages: " + book.getInt("numberOfPages"));
            JSONArray authors = book.getJSONArray("authors");
            System.out.print("Authors: ");
            for (int j = 0; j < authors.length(); j++) {
                System.out.print(authors.getString(j));
                if (j < authors.length() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("\n");
        }
    }


    private static void addNewJsonBook(JSONArray books) {
        JSONObject newBook = new JSONObject();
        newBook.put("title", "New Book Title");
        newBook.put("publishedYear", 2024);
        newBook.put("numberOfPages", 123);
        JSONArray authors = new JSONArray();
        authors.put("New Author");
        newBook.put("authors", authors);

        books.put(newBook);
    }
}

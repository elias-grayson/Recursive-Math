/* Elias Grayson */
import java.util.ArrayList;

/* This class is a library that stores books */
public class Library {

    // Instantiates nothing
    public Library() {
    }

    private ArrayList<Book> books = new ArrayList<Book>(); // This stores a list of books
    private Book book; // This stores a book

    // This adds a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // This removes a book via its ISBN
    public String removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            
            // Makes sure the ISBN's of the books match before removing
            if (books.get(i).getIsbn() == isbn) {
                books.remove(i);
                return books.get(i).getTitle();
            }
        }
        return null;
    }
    
    // This prints all of the added books
    public String printBooks() {
        String allBooks = ""; // Stores all of the books that were added

        // This goes through all of the books and returns them
        for (int i = 0; i < books.size(); i++) {
            allBooks += "\n" + books.get(i).getDetails();
        }
        return allBooks;
    }
}
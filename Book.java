/* Elias Grayson */
/* This class has a book with a title, author, and ISBN */
public class Book {
    
    private String title; // This stores the title of the book
    private String author; // This stores the author
    private String isbn; // This stores the isbn

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // This returns the title, author, and isbn of the book
    public String getDetails() {
        return "Title: " + title + " Author: " + author + " ISBN: " + isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}

public class LibraryTest extends Library {
    
    // Instantiates the same constructor as BankAccount
    public LibraryTest() {
    }

    // This method is the method used for testing
    public static void main(String[] args) {

        // 
        Book x1 = new Book("The Puyo Puyo Encyclopedia", "Elias Grayson", "98076");        

        // Student x2 test if the student enters only 1 grade
        Book x2 = new Book("Dio Addiction Self Help Guide", "Maggie Pang", "1007");

        // Student x3 tests if the student adds a lot of classes
        Book x3 = new Book("Macbeth", "William Shakespeare", "66666");  

        // Student x4 tests if the student enters negative values for their grades
        Book x4 = new Book("Puyo Puyo Nursery Rhymes", "Elias Grayson", "72");

        // Gives out the result
        Library combinedBooks = new Library();
        combinedBooks.addBook(x1);
        combinedBooks.addBook(x2);
        combinedBooks.addBook(x3);
        combinedBooks.addBook(x4);
        combinedBooks.removeBook("1007");
        System.out.println("Behold. My empire of books: " + combinedBooks.printBooks());
    }
}

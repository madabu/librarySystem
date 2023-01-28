import java.util.ArrayList;

public class LibrarySystem {
    private ArrayList<Librarian> librarians = new ArrayList<>();
    private ArrayList <Books> books;
    private ArrayList <Customer> customers;
    private int numberOfBooks;
    private int numberOfEmployees;
    private int numberOfBorrowedBooks;

    public LibrarySystem (ArrayList<Librarian> librarians) {
        this.librarians = librarians;
    }


     public LibrarySystem (Librarian librarian) {
         this.librarians.add(librarian);
     }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
}

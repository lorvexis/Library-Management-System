import java.util.ArrayList;
import java.util.Comparator;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    // Filtering
    public void showAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    // Searching
    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Sorting
    public void sortBooksByTitle() {
        books.sort(Comparator.comparing(Book::getTitle));
    }

    public void showAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

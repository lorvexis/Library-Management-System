import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell", "111", true));
        library.addBook(new Book("Brave New World", "Aldous Huxley", "222", false));
        library.addBook(new Book("Animal Farm", "George Orwell", "333", true));

        System.out.println("Available books:");
        library.showAvailableBooks();

        System.out.print("\nEnter ISBN to search: ");
        String isbn = scanner.nextLine();

        Book foundBook = library.findBookByIsbn(isbn);
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("\nBooks sorted by title:");
        library.sortBooksByTitle();
        library.showAllBooks();

        LibraryMember member = new LibraryMember(1, "Islam");
        System.out.println("\nMember info:");
        System.out.println(member);
        System.out.println("Role: " + member.getRole());

        scanner.close();
    }
}

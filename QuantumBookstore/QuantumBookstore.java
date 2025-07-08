import java.util.*;

public class QuantumBookstore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println("Quantum book store: Added " + book);
    }

    public void removeOutdatedBooks(int maxAge, int currentYear) {
        inventory.values().removeIf(book -> currentYear - book.getYear() > maxAge);
        System.out.println("Quantum book store: Removed outdated books older than " + maxAge + " years.");
    }

    public void buyBook(String isbn, int quantity, String email, String address) {
        Book book = inventory.get(isbn);
        if (book == null) {
            System.out.println("Quantum book store: Book not found.");
            return;
        }
        try {
            book.buy(quantity, email, address);
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }
    }

    public void listBooks() {
        inventory.values().forEach(System.out::println);
    }
}

public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        QuantumBookstore store = new QuantumBookstore();

        Book paper = new PaperBook("ISBN123", "Java Basics", 2015, 49.99, "Hassan Abdallah", 5);
        Book ebook = new EBook("ISBN456", "Digital Java", 2021, 19.99, "Alaa Abdallah", "PDF");
        Book demo = new ShowcaseBook("ISBN789", "Sneak Peek Java", 2020, 0.0, "Marawan Mohamed");

        store.addBook(paper);
        store.addBook(ebook);
        store.addBook(demo);

        System.out.println("\n-- Attempting purchases --");
        store.buyBook("ISBN123", 1, "hassan.abdallah.me@gmail.com", "Giza, Egypt");
        store.buyBook("ISBN456", 2, "alaa.abdallah.97@gmail.com", "Giza, Egypt");
        store.buyBook("ISBN789", 3, "marawan@gmail.com", "Cairo, Egypt");

        System.out.println("\n-- Removing outdated books --");
        store.removeOutdatedBooks(8, 2025);

        System.out.println("\n-- Final inventory --");
        store.listBooks();
    }
}

public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int year, double price, String author) {
        super(isbn, title, year, price, author);
    }

    @Override
    public void buy(int quantity, String email, String address) throws Exception {
        throw new Exception("Quantum book store: Showcase book is not for sale.");
    }
}

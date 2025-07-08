public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    @Override
    public void buy(int quantity, String email, String address) throws Exception {
        if (stock < quantity) {
            throw new Exception("Quantum book store: Not enough stock for ISBN " + isbn);
        }
        stock -= quantity;
        double total = quantity * price;
        System.out.println("Quantum book store: Paid $" + total);
        System.out.println("Quantum book store: Sent paper book to " + address);
    }

    public int getStock() {
        return stock;
    }
}

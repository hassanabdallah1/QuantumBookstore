public abstract class Book {
    protected String isbn;
    protected String title;
    protected int year;
    protected double price;
    protected String author;

    public Book(String isbn, String title, int year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public abstract void buy(int quantity, String email, String address) throws Exception;

    @Override
    public String toString() {
        return String.format("%s (%s) - %s, $%.2f by %s", title, isbn, year, price, author);
    }
}

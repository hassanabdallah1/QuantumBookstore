# Quantum Bookstore

This is my solution for the second task in the Fawry Internship Challenge (N² Dev Slope #10).

It’s a small Java console application that simulates an online bookstore with different types of books:
- Paper Books
- EBooks
- Demo Books (not for sale)

### 👨‍💻 Features
- Add books to inventory with ISBN, title, author, year, and price
- Remove old books that were published more than a certain number of years ago
- Buy books using their ISBN:
  - Paper books reduce stock and get sent to a shipping address
  - EBooks are sent to an email
  - Demo books can't be purchased (an error message is shown)

### 🧪 Test Class
The class `QuantumBookstoreFullTest` contains examples of:
- Adding 3 different types of books
- Trying to buy each one (including a demo book)
- Removing outdated books
- Printing the final inventory

### ⚙️ How to Run
Make sure you have Java installed. Then compile and run:

```bash
javac QuantumBookstoreFullTest.java
java QuantumBookstoreFullTest

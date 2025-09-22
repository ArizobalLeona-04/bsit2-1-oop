public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===");

        // Create books
        Book b1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book b2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book b3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);

        // Create library
        Library lib = new Library();

        // Add books
        System.out.println("\nAdding books to library...");
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        // Display all books
        lib.displayAllBooks();

        // Borrow book
        System.out.println("\nBorrowing Java Programming...");
        if (lib.borrowBook("1234567890")) System.out.println("Book borrowed successfully!");
        else System.out.println("Book is not available for borrowing.");

        // Try borrowing again
        System.out.println("\nTrying to borrow Java Programming again...");
        if (lib.borrowBook("1234567890")) System.out.println("Book borrowed successfully!");
        else System.out.println("Book is not available for borrowing.");

        // Display available books
        lib.displayAvailableBooks();

        // Return book
        System.out.println("\nReturning Java Programming...");
        if (lib.returnBook("1234567890")) System.out.println("Book returned successfully!");
        else System.out.println("Book was not borrowed.");

        // Test validation
        System.out.println("\nTesting validation...");
        try {
            Book invalidBook = new Book("Invalid Book", "Anon", "12", 1400);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

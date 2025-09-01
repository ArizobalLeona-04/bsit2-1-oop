import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    ArrayList<String> books;
    Scanner scanner;

    public LibraryManager() {
        books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
        scanner = new Scanner(System.in);
    }

    public void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is not initialized");
            }
            if (books.isEmpty()) {
                System.out.println("Library has no books.");
            } else {
                System.out.println("Books in Library:");
                for (int i = 0; i < books.size(); i++) {
                    System.out.println(i + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Show books operation completed.\n");
        }
    }

    public void addBook() {
        try {
            System.out.print("Enter book title to add: ");
            String title = scanner.nextLine();
            if (title == null || title.trim().isEmpty()) {
                throw new IllegalArgumentException("Book title cannot be empty");
            }
            if (title.length() < 3) {
                throw new IllegalArgumentException("Book title must be at least 3 characters long");
            }
            books.add(title);
            System.out.println("Book added successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Add book operation completed.");
            showBooks();
        }
    }

    public void removeBook() {
        try {
            if (books.isEmpty()) {
                System.out.println("Library is empty. No books to remove.");
                return;
            }
            System.out.print("Enter index of book to remove: ");
            String input = scanner.nextLine();
            int index = Integer.parseInt(input);
            if (index < 0) {
                throw new IllegalArgumentException("Index cannot be negative");
            }
            String removedBook = books.remove(index);
            System.out.println("Removed book: " + removedBook);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number input.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Remove book operation completed.");
            showBooks();
        }
    }

    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        manager.showBooks();
        manager.addBook();
        manager.removeBook();
    }
}

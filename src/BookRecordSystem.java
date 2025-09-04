import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private static int totalBooks = 0; 


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
        totalBooks++; 
    }

    
    public void addRating(int rating) throws IllegalArgumentException {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
        }
        ratings.add(rating);
    }

    
    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return sum / ratings.size();
    }

    
    public String getPopularityLevel() {
        if (ratings.isEmpty()) {
            return "No ratings";
        }

        double avg = getAverageRating();
        if (avg >= 4.5) return "Excellent";
        else if (avg >= 3.5) return "Good";
        else if (avg >= 2.5) return "Average";
        else if (avg >= 1.5) return "Poor";
        else return "Terrible";
    }

    // Add multiple ratings (varargs)
    public void addMultipleRatings(int... ratings) {
        for (int r : ratings) {
            try {
                addRating(r);
            } catch (IllegalArgumentException e) {
                System.out.println("Error adding rating " + r + " to \"" + title + "\": " + e.getMessage());
            }
        }
    }

    
    public static int getTotalBooks() {
        return totalBooks;
    }

    
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    
    @Override
    public String toString() {
        return "Book: \"" + title + "\" by " + author +
               ", Average Rating: " + String.format("%.2f", getAverageRating()) +
               ", Level: " + getPopularityLevel();
    }
}


public class TestBook {
    public static void main(String[] args) {
        
        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Effective Communication", "Dale Carnegie");
        Book book3 = new Book("History of Science", "Isaac Newton");

        
        try {
            book1.addRating(4);
            book2.addRating(5);
            book3.addRating(3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        book1.addMultipleRatings(5, 4, 3, 5);
        book2.addMultipleRatings(5, 6, 0, 4); 
        book3.addMultipleRatings(2, 3, 4);

        
        System.out.println("\n=== Book Records ===");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        
        System.out.println("\nTotal Books Created: " + Book.getTotalBooks());

        
        Book bestBook = book1;
        if (book2.getAverageRating() > bestBook.getAverageRating()) {
            bestBook = book2;
        }
        if (book3.getAverageRating() > bestBook.getAverageRating()) {
            bestBook = book3;
        }

        System.out.println("\nBook with Highest Average Rating:");
        System.out.println(bestBook);
    }
}

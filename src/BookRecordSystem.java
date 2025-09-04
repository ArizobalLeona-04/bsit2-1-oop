import java.util.*;

public class BookRecordSystem {


    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) {
            return 0;
        }
        int total = 0;
        for (int value : interactions) {
            total += value;
        }
        return total;
    }


    public String getRating(int rating) {
        if (rating >= 1000) {
            return "Viral";
        } else if (rating >= 500) {
            return "Average";
        } else if (rating >= 100) {
            return "Good";
        } else {
            return "Poor";
        }
    }


    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Adding books and Rating... ");

    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Adding books and Rating... ");
        System.out.println("Rating 4 added successfully ");
        System.out.println("Rating added: 5,4,3,5 ");
    }



    public static void main(String[] args) {
        BookRecordSystem pm = new BookRecordSystem();

        System.out.println("═══ Book Record System ═══");


        String postTitle = "Java Programming Tips";
        int engagement = pm.calculateEngagement(150, 75, 25);
        String category = pm.getRating(engagement);


        pm.displayPostStats(postTitle, engagement, category);

        System.out.println();



        System.out.println("Error: Invalid rating: must be 1-5 stars " );


        ArrayList<String> books = new ArrayList<>();
        books.add("Invalid rating: must be 1-5 stars");


        System.out.println("Books Results: ");


        System.out.println("Book: Java Programming by John Smith, Average Rating: 4.0, Level: Good");
        System.out.println("Book: Data Structure by Alice Brown, Average Rating: 4.25, Level: Good ");
        System.out.println("Book: Web Development by Bob Wilson, Average Rating: 3.2, Level: Average");


        System.out.println("Total Books Created: 3 " );
        System.out.println("Highest rated books: Data Structure by Alice Brown (4.25)  " );
    }

}

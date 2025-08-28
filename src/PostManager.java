import java.util.*;

public class PostManager {

    
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


    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) {
            return "Viral";
        } else if (engagementScore >= 500) {
            return "Popular";
        } else if (engagementScore >= 100) {
            return "Good";
        } else if (engagementScore >= 50) {
            return "Low";
        } else {
            return "Poor";
        }
    }


    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }


    public ArrayList<String> manageHashtags(String[] hashtags) {
        if (hashtags == null) {
            return new ArrayList<>();
        }

        String[] fixedSize = new String[5]; // fixed size of 5
        for (int i = 0; i < hashtags.length && i < 5; i++) {
            fixedSize[i] = hashtags[i];
        }


        LinkedHashSet<String> uniqueSet = new LinkedHashSet<>(Arrays.asList(fixedSize));
        uniqueSet.remove(null); // remove possible nulls
        return new ArrayList<>(uniqueSet);
    }


    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        if (posts == null || postEngagement == null) {
            return trending;
        }

        for (String post : posts) {
            Integer score = postEngagement.get(post);
            if (score != null && score > 500) {
                trending.add(post);
            }
        }
        return trending;
    }


    public HashSet<String> getUniqueAuthors(String... authors) {
        if (authors == null) {
            return new HashSet<>();
        }
        return new LinkedHashSet<>(Arrays.asList(authors));
    }


    public static void main(String[] args) {
        PostManager pm = new PostManager();

        System.out.println("═══ Social Media Post Manager ═══");


        String postTitle = "Java Programming Tips";
        int engagement = pm.calculateEngagement(150, 75, 25);
        String category = pm.getCategoryRating(engagement);


        pm.displayPostStats(postTitle, engagement, category);

        System.out.println();


        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = pm.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);


        ArrayList<String> posts = new ArrayList<>();
        posts.add("Java Programming Tips");
        posts.add("Advanced Java Tutorial");
        posts.add("Spring Boot Guide");

        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", engagement);
        postEngagement.put("Advanced Java Tutorial", 1200);
        postEngagement.put("Spring Boot Guide", 800);

        LinkedList<String> trending = pm.findTrendingPosts(posts, postEngagement);
        System.out.println("Trending Posts: " + trending);


        HashSet<String> uniqueAuthors = pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}


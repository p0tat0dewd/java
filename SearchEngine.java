import java.util.List;

public class SearchEngine {

    public static void search(List<String> data, String keyword) {
        for (String item : data) {
            if (item.contains(keyword)) {
                System.out.println("Found: " + item);
            }
        }
    }

    public static void search(List<String> data, int startDate, int endDate) {
        for (String item : data) {
            System.out.println("Found: " + item + " (Date range: " + startDate + " to " + endDate + ")");
        }
    }

    public static void search(List<String> data, String query, int relevanceThreshold) {
        for (String item : data) {
            System.out.println("Found: " + item + " (Relevance: " + getRelevanceScore(item, query) + ")");
        }
    }

    private static int getRelevanceScore(String item, String query) {
        return item.length();
    }

    public static void main(String[] args) {
        List<String> data = List.of("Item 1: important information",
                "Item 2: data created on 2024-02-16",
                "Item 3: relevant content");

        System.out.println("Searching by keyword:");
        search(data, "important");

        System.out.println("\nSearching by date range:");
        search(data, 2024, 2024);

        System.out.println("\nSearching by relevance:");
        search(data, "content", 10);
    }
}

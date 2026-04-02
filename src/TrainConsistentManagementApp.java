import java.util.*;

public class TrainConsistentManagementApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Attempt to add duplicate ID
        boolean isAdded = bogieIds.add("BG101"); // duplicate

        // Display all bogie IDs
        System.out.println("\nBogie IDs in the train:");
        System.out.println(bogieIds);

        // Check if duplicate was added
        System.out.println("\nWas duplicate BG101 added? " + isAdded);

        // Check existence of a bogie ID
        boolean exists = bogieIds.contains("BG102");
        System.out.println("\nDoes BG102 exist? " + exists);

        // Final count
        System.out.println("\nTotal unique bogies: " + bogieIds.size());

    }
}
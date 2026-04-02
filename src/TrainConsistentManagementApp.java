import java.util.*;

public class TrainConsistentManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt to add duplicate bogie
        train.add("Sleeper"); // duplicate (will be ignored)

        // Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);

    }
}
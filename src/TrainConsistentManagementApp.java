import java.util.*;

public class TrainConsistentManagementApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogies with their capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);

        // Display all bogies with capacities
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());


        }
    }
}
// ---------------- Main Application ----------------
import java.util.Arrays;


public class TrainConsistentManagementApp {
    public static void main(String[] args) {
        // Example bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println(" Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        System.out.println("\n After Sorting (Alphabetical Order):");
        System.out.println(Arrays.toString(bogieNames));
    }
}

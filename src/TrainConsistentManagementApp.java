import java.util.Scanner;

public class TrainConsistentManagementApp {
    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String searchKey) {
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                return true; // Match found
            }
        }
        return false; // No match found
    }

    public static void main(String[] args) {
        // Example bogie IDs
        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        boolean found = linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("✅ Bogie ID " + searchKey + " found in the consist.");
        } else {
            System.out.println("❌ Bogie ID " + searchKey + " not found in the consist.");
        }

        scanner.close();
    }
}


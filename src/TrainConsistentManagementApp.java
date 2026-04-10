import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistentManagementApp {
    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String searchKey) {
        // Ensure the array is sorted before searching
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true; // Match found
            } else if (comparison < 0) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1; // Search right half
            }
        }
        return false; // Not found
    }

    public static void main(String[] args) {
        // Example bogie IDs (unsorted to demonstrate sorting before search)
        String[] bogieIds = {"BG309","BG101","BG550","BG205","BG412"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("✅ Bogie ID " + searchKey + " found in the consist.");
        } else {
            System.out.println("❌ Bogie ID " + searchKey + " not found in the consist.");
        }

        scanner.close();
    }
}



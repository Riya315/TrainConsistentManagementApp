import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistentManagementApp {
    // Defensive Binary Search Method with validation
    public static boolean binarySearchWithValidation(String[] bogieIds, String searchKey) {
        // Validate state before searching
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException(" Cannot perform search: No bogies available in the train consist.");
        }

        // Ensure array is sorted before binary search
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
        // Example bogie IDs
        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        try {
            boolean found = binarySearchWithValidation(bogieIds, searchKey);

            if (found) {
                System.out.println(" Bogie ID " + searchKey + " found in the consist.");
            } else {
                System.out.println(" Bogie ID " + searchKey + " not found in the consist.");
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}




class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistentManagementApp {

    public static void main(String[] args) {

        // Example passenger bogie capacities
        PassengerBogie[] bogies = {
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 56),
                new PassengerBogie("First Class", 24),
                new PassengerBogie("Sleeper", 70),
                new PassengerBogie("AC Chair", 60)
        };

        System.out.println(" Before Sorting:");
        displayBogies(bogies);

        bubbleSort(bogies);

        System.out.println("\n After Sorting (Ascending by Capacity):");
        displayBogies(bogies);
    }

    // Bubble Sort Algorithm
    public static void bubbleSort(PassengerBogie[] bogies) {
        int n = bogies.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bogies[j].getCapacity() > bogies[j + 1].getCapacity()) {
                    // Swap
                    PassengerBogie temp = bogies[j];
                    bogies[j] = bogies[j + 1];
                    bogies[j + 1] = temp;
                }
            }
        }
    }

    // Display Bogies
    public static void displayBogies(PassengerBogie[] bogies) {
        for (PassengerBogie bogie : bogies) {
            System.out.println(bogie);
        }
    }
}
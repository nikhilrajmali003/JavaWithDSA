import java.util.Scanner;

class one {
    // Method to insert a new element at a specific position
    public static int[] insertion(int[] data) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the element you want to insert and the position (0-based index):");
        int element = x.nextInt();
        int position = x.nextInt();

        if (position < 0 || position > data.length) {
            System.out.println("Invalid position");
            return data;  // Return original array if position is invalid
        }

        // Create a new array with size increased by 1
        int[] newData = new int[data.length + 1];

        // Copy elements and insert the new element at the specified position
        for (int i = 0, j = 0; i < newData.length; i++) {
            if (i == position) {
                newData[i] = element;  // Insert the new element
            } else {
                newData[i] = data[j++];  // Copy elements from the original array
            }
        }

        System.out.println("Insertion Successful");
        return newData;  // Return the updated array
    }

    // Method to delete an element at a specific position
    public static int[] deletion(int[] data) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the position to delete (0-based index):");
        int position = x.nextInt();

        if (position < 0 || position >= data.length) {
            System.out.println("Invalid position");
            return data;  // Return original array if position is invalid
        }

        // Create a new array with size reduced by 1
        int[] newData = new int[data.length - 1];

        // Copy elements, skipping the one at the specified position
        for (int i = 0, j = 0; i < data.length; i++) {
            if (i == position) {
                continue;  // Skip the element at the deletion position
            }
            newData[j++] = data[i];
        }

        System.out.println("Deletion Successful");
        return newData;  // Return the updated array
    }

    // Method to update an element at a specific position
    public static void update(int[] data) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the element you want to update and the position:");
        int element = x.nextInt();
        int position = x.nextInt();

        if (position < 0 || position >= data.length) {
            System.out.println("Invalid position");
            return;
        }

        data[position] = element;
        System.out.println("Update Successful");
    }

    // Method to display the array
    public static void display(int[] data) {
        System.out.println("Array elements:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = x.nextInt();
        int[] data = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            data[i] = x.nextInt();
        }

        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1> Insertion");
            System.out.println("2> Deletion");
            System.out.println("3> Update");
            System.out.println("4> Display");
            System.out.println("5> Exit");
            int choice = x.nextInt();

            switch (choice) {
                case 1:
                    data = insertion(data);  // Update the reference to the modified array
                    break;
                case 2:
                    data = deletion(data);  // Update the reference to the modified array
                    break;
                case 3:
                    update(data);
                    break;
                case 4:
                    display(data);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

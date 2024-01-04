package lab6_q1;

import java.util.Scanner;

public class Lab6_q1 {

    public static String[] removeNameFromArray(String[] painters, String name) {
        int n = binarySearch(painters, name);
        if (n == -1) {
            return painters;
        }

        String[] array = new String[painters.length - 1];

        for (int i = 0; i < n; i++) {
            array[i] = painters[i];
        }

        for (int i = n; i < array.length; i++) {
            array[i] = painters[i + 1];
        }

        return array;
    }

    public static int binarySearch(String[] arr, String name) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparisonResult = name.compareTo(arr[mid]);
            if (comparisonResult == 0) {
                return mid;
            }
            if (comparisonResult > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static String[] addNameToArray(String[] painters, String name) {
        String[] array = new String[painters.length + 1];
        for (int i = 0; i < painters.length; i++) {
            array[i] = painters[i];
        }
        array[painters.length] = name;
        return array;
    }

    public static void display(String[] painters) {
        System.out.println("Current array content:");
        for (int i = 0; i < painters.length; i++) {
            System.out.print(painters[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] painters = {"Da Vinci", "Monet", "Van Gogh", "Rembrandt", "Picasso", "Raphael", "Michelangelo"};
        display(painters);

        while (true) {
            System.out.println("Enter \"add\" to add a painter, \"delete\" to delete a painter, or \"*\" to EXIT:");
            String userInput = scn.nextLine();

            if (userInput.equals("*")) {
                break;
            } else if (userInput.equals("add")) {
                System.out.println("Enter painter's name:");
                String newPainter = scn.nextLine();
                painters = addNameToArray(painters, newPainter);
                display(painters);
            } else if (userInput.equals("delete")) {
                System.out.println("Enter painter's name:");
                String painterToDelete = scn.nextLine();
                painters = removeNameFromArray(painters, painterToDelete);
                display(painters);
            } else {
                System.out.println("Invalid input. Please enter \"add\", \"delete\", or \"*\".");
            }
        }
    }

}

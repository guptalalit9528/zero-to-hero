package dsa.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {40, 57, 93, 1, 6, 80, 7};
        int target = 100;
        boolean isFound = false;
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                isFound = true;
                position = i;
                break;
            }
        }
        if (isFound) {
            System.out.println("Element " + target + " found at " + position + " position");
        } else {
            System.out.println("Annnnhhhhh element not found");
        }
    }
}

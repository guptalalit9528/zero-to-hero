package dsa.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("welcome to the insertion sort");
        int[] arr = { 3, 6, 2, 8, 1};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;

            }
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}


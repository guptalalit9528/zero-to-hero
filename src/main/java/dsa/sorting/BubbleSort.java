package dsa.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Welcome to my bubble sort program");

        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the size of array: ");
        // int size = input.nextInt();
        // int[] arr = new int[size];
        // System.out.println("Enter the array elements:");
        // for (int i = 0; i < size; i++) {
        //     arr[i] = input.nextInt();
        // }

        int[] arr = {8, 6, 7, 3};  // array
        boolean swaped = false;  //

        for (int i = 0; i < arr.length; i++) {   //outer loop

            for (int j = 0; j < arr.length - 1 - i; j++) {     //inner loop
                if (arr[j] > arr[j + 1]) {
                    // Swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaped = true;
                }
            }

            if (!swaped) {
                break;  //  //agar already swap hoga to ye outer loop me le jayega
            }
        }

        System.out.print("Sorted: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}

package dsa.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int low= 0;
        int high=arr.length-1;
        int target = 2;

       while(low<=high) {
           int mid =(low+high)/ 2;

            if (arr[mid] == target) {
                System.out.println("found it:" + mid);
                break;
            }else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
       }
    }
}

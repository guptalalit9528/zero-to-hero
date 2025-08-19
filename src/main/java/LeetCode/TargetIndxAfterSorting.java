package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class TargetIndxAfterSorting {
    public static void main(String[] args) {

        int [] arr={1,2,5,2,3};
        boolean swaped = false;

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
                break;
            }
        }
//        List<Integer> list = new ArrayList<>()
//        for (int i = 0; i < arr.length; i++) {
////            int num[] = {5};
////            num[0] =arr[i];
////            num[1] = arr[i+1];
////            num[2] =  arr[i+2];
////            num[1] =  arr[i+3];
////            num[2] =  arr[i+4];
//
//
//
//                System.out.print(arr[i] + "  ");
//                //System.out.println("array sorted:" + num);
//            }
//            return list;
    }
}


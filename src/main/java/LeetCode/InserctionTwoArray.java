package LeetCode;

public class InserctionTwoArray {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 1};
        int[] num2 = {2,1 };

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    System.out.print(+ num1[i]+"  ");
                    break;
                }
            }
        }
    }
}


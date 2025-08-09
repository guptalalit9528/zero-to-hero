import java.util.Scanner;

public class EvenOdd {
    public static void main(String[]args){
        System.out.println("welcome to even odd number print");
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter number:");
        int n=sc.nextInt();

        if(n%2==0){
            System.out.println("this is even number");
        }
        else{
            System.out.println("this is a odd number");
        }
    }
}

import java.util.Scanner;

public class ASK{
    public static void main(String[] args) {
        System.out.println("FRIDAY LOGIN ==>"); 
        //login in 
        System.out.println("Give user input");
        Scanner friday = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = friday.nextInt();
        System.out.println("enter number 2");
        int b = friday.nextInt();
        int sum =a+b;
        System.out.println("the sum of these number is ");
        System.out.println(sum);
    }
}

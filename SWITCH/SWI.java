import java.util.Scanner;

public class SWI {
    public static void main(String[] args) {
        int age;
        System.out.println("ENTER YOUR VALUE AGE");

        Scanner ag = new Scanner(System.in);
        age = ag.nextInt();

        if (age > 56) {
            System.out.println("you are over age");
        } else if (age > 46) {
            System.out.println("you are adult middle age");
        } else if (age > 35) {
            System.out.println("you are an adult");
        } else {
            System.out.println("you are young!");
        }
    }
}

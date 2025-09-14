import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long factorial = 1;  // use long for large factorials

        for (int i = 1; i <= num; i++) {
            factorial *= i;  // factorial = factorial * i
        }

        System.out.println("Factorial of " + num + " is: " + factorial);

        sc.close();
    }
}
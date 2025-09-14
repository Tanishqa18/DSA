import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        char ch = 'A';  // starting character

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
                if (ch > 'Z') {  // wrap around if beyond Z
                    ch = 'A';
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

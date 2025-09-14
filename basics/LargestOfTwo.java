public class LargestOfTwo {
    public static void main(String[] args) {
        int num1 = 25, num2 = 40;

        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
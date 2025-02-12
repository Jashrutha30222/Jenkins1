public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5; // Change the number to test
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}

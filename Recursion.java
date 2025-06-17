public class Recursion {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive call
        }
          
    }
    public static void main(String[] args) {
    
        int result = factorial(6);
        System.out.println("Factorial of 6"  + " is: " + result);
    }

}

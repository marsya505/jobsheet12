import java.util.Scanner;
public class Assignment3 {
    static boolean PrimeCheckRecursive(int number, int divisor) {
        if (number < 0) {
            return false; 
        }
        if (divisor == 1) {
            return true; 
        }
        if (number % divisor == 0) {
            return false; 
        }
        return PrimeCheckRecursive(number, divisor - 1); 
    }
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = input11.nextInt(); 
        boolean result = PrimeCheckRecursive(number, number - 1);
        if (result) {
            System.out.println(number + " prime number.");
        } else {
            System.out.println(number + " not prime number.");
        }
    }
}
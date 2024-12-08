import java.util.Scanner;
public class Assignment2 {
    static int sumNumRecursive(int n, StringBuilder sequence) {
        if (n == 0) {
            return 0; 
        } else {
            int sum = n + sumNumRecursive(n - 1, sequence);
            sequence.insert(0, n + "+"); 
            return sum;
        }
    }
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = input11.nextInt();
        StringBuilder sequence = new StringBuilder();
        int result = sumNumRecursive(n, sequence);
        sequence.delete(sequence.length() - 1, sequence.length());
        System.out.println("Result: " + sequence + " = " + result);
    }
}
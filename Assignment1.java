import java.util.Scanner;
public class Assignment1 {
    static void Recursive(int n) {
        if (n < 0) {
            return; 
        }
        System.out.print(n + " ");
        Recursive(n - 1); 
    }
    static void Iterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = input11.nextInt();
        System.out.println("Recursive numbers from " + n + " to 0:");
        Recursive(n);
        System.out.println(); 
        System.out.println("Iterative numbers from " + n + " to 0:");
        Iterative(n);
    }
}
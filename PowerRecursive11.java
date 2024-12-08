import java.util.Scanner;
public class PowerRecursive11 {
    static String series = "";
    static int calculatePower(int base, int pow) {
        if (pow==0) {
            series += "1";
            return 1;
    } else {
        series += base + "x";
            return base*calculatePower(base, pow-1);
        }
    }
    public static void main(String[] args) {
    Scanner input11 = new Scanner(System.in);
    System.out.print("Input Base Number: ");
    int base = input11.nextInt();
    System.out.print("Input Power Number: ");
    int power = input11.nextInt();
    int result = calculatePower(base, power);
    System.out.println("Result of: " + base + " power " + power + " = " + series + " = " + result);
    }
}
import java.util.Scanner;
public class ProvitRecursive11 {
    static double calculateProvit(double balance, int period) {
        if(period==0)
            return balance;
        else 
            return 1.11*calculateProvit(balance, period-1);
    }
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Input Balance: ");
        double initialBalance = input11.nextInt();
        System.out.print("Input Investment Period: ");
        int investPeriod = input11.nextInt();
        System.out.println("Balance after "+ investPeriod +" year = "
        +calculateProvit(initialBalance, investPeriod));
    }
}
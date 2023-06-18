import java.util.Scanner;

public class bank {
    int balance;
    int AmountToWithdraw;
    int donation;

    public void deposit(int x) {
        balance = x;
    }

    public void withdraw(int y) {
        AmountToWithdraw = balance - y;
    }

    public void donateToPoor(int p) {
        donation = AmountToWithdraw - p;
    }

    public static void main(String[] args) throws Exception {
        bank car = new bank();

        Scanner z = new Scanner(System.in); // Create a Scanner object
        System.out.println("How much would you like to deposit?");

        int hehe = z.nextInt(); // Read user input
        System.out.println("Deposit is: " + hehe); // Output user input

        car.deposit(hehe);
        System.out.println("Total Amount: " + car.balance);

        Scanner t = new Scanner(System.in); // Create a Scanner object
        System.out.println("How much would you like to withdraw?");

        int huhu = t.nextInt(); // Read user input
        System.out.println("Withdrawal is: " + huhu); // Output user input

        car.withdraw(huhu);
        System.out.println("Total Amount: " + car.AmountToWithdraw);

        Scanner m = new Scanner(System.in); // Create a Scanner object
        System.out.println("How much would you like to donate?");

        int he = m.nextInt(); // Read user input
        System.out.println("Donation is: " + he); // Output user input

        car.donateToPoor(he);
        System.out.println("Total Amount: " + car.donation);
    }
}

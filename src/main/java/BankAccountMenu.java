import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        boolean run = true;

        while (run){
            System.out.println("--- Bank Account Menu  ---");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:  ");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter the amount to add:  ");
                    double addAmount = sc.nextDouble();
                    if (addAmount > 0){
                        balance += addAmount;
                        System.out.printf("Added $%.2f%n ", addAmount);
                        System.out.printf("New balance $%.2f%n ", balance);
                    }
                    else {
                        System.out.println("Error: value entered must be positive.");
                    }
                    break;

                case 2:
                    System.out.println("Enter the amount to withdraw:  ");
                    double amountWithdraw = sc.nextDouble();
                    if (amountWithdraw > 0)
                    {
                        if (amountWithdraw <= balance){
                            balance -= amountWithdraw;
                            System.out.printf("Withdrew $%.2f%n ", amountWithdraw);
                            System.out.printf("New balance $%.2f%n ", balance);
                        }
                        else {
                            System.out.println("Error: Insufficient funds");

                            }
                    } else {
                        System.out.println("Error: number must be positive");
                    }
                    break;

                case 3:
                    System.out.printf("Your balance is $%.2f%n ", balance);
                    break;

                case 4:
                    run = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        sc.close();
    }
}

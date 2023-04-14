import java.util.Scanner;

public class ATM {
    
    private static Scanner scanner = new Scanner(System.in);
    private static int balance = 1000; // initial balance
    private static String name = "";
    private static String userID = "";
    
    public static void main(String[] args) {
        
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter user ID: ");
        userID = scanner.nextLine();
        System.out.print("Enter user PIN: ");
        String userPIN = scanner.nextLine();
        
        if (login(userID, userPIN)) {
            System.out.println("Welcome to the ATM, " + name + "!");
            while (true) {
                showMenu();
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        viewTransactionHistory();
                        break;
                    case 2:
                        withdraw();
                        break;
                    case 3:
                        deposit();
                        break;
                    case 4:
                        transfer();
                        break;
                    case 5:
                        showProfile();
                        break;
                    case 6:
                        System.out.println("Thank you for using the ATM!");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid userID or userPIN.");
        }
    }
    
    private static boolean login(String userID, String userPIN) {
        // check if userID and userPIN are valid
        return true; // return true if login is successful
    }
    
    private static void showMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. View Transaction History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Show Profile");
        System.out.println("6. Quit");
        System.out.print("Choose an option: ");
    }
    
    private static void viewTransactionHistory() {
        // display transaction history
        System.out.println("Transaction history:");
        // TODO: add code to display transaction history
    }
    
    private static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn. Remaining balance: $" + balance);
        }
    }
    
    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println("$" + amount + " deposited. New balance: $" + balance);
    }
    
    private static void transfer() {
        System.out.print("Enter recipient's userID: ");
        String recipientID = scanner.next();
        System.out.print("Enter amount to transfer: ");
        int amount = scanner.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " transferred to " + recipientID + ". Remaining balance: $" + balance);
        }
    }
    
    private static void showProfile() {
        System.out.println("User Profile:");
        System.out.println("Name: " + name);
        System.out.println("User ID: " + userID);
        System.out.println("Balance: $" + balance);
    }
}

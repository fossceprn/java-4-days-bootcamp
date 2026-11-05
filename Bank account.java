class BankAccount {

    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String name, String number, double bal) {
        accountHolder = name;
        accountNumber = number;
        balance = bal;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Display method
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Jyothika", "101", 5000);
        BankAccount acc2 = new BankAccount("Swathi", "102", 3000);

        acc1.deposit(2000);
        acc2.deposit(1000);

        acc1.withdraw(1500);

        System.out.println("\nUpdated Account Details:");

        acc1.displayDetails();
        acc2.displayDetails();
    }
}

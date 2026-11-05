package test;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Anto k", 1001, 5000);
        BankAccount b2 = new BankAccount("Abhi", 1002, 8000);

        b1.deposit(2000);
        b2.deposit(1000);

        b1.withdraw(1500);

        b1.displayDetails();
        b2.displayDetails();
    }
}

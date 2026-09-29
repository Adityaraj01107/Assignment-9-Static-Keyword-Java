class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    static double interestRate = 6.5;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1001, "Rahul", 25000);
        BankAccount a2 = new BankAccount(1002, "Priya", 35000);
        BankAccount a3 = new BankAccount(1003, "Aman", 45000);

        System.out.println("Before changing interest rate:");
        a1.displayDetails();
        a2.displayDetails();
        a3.displayDetails();

        BankAccount.interestRate = 7.5;

        System.out.println("After changing interest rate:");
        a1.displayDetails();
        a2.displayDetails();
        a3.displayDetails();
    }
}

public class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;
    private static int totalAccounts = 0;
    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        totalAccounts++;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }
    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient balance.");
        }
    }
    public static void displayTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1001, "hehe", 1000.0);  
        BankAccount account2 = new BankAccount(1002, "meowmeow", 500.0);
        account1.depositMoney(200.0);
        account2.withdrawMoney(100.0);
        System.out.println("Account 1: " + account1.getName() + ", Balance: " + account1.getBalance());
        System.out.println("Account 2: " + account2.getName() + ", Balance: " + account2.getBalance());
        BankAccount.displayTotalAccounts();
    }
}

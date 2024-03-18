class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money) {
        if(money<=0) {
            System.out.println("Invalid Deposit");
        } else {
            balance += money;
        }
    }
    public double withdrawMoney(double money) {
        if(money <= 0) {
            System.out.println("Invalid Withdraw");
        }else if(balance >= money) {
            balance -= money;
        } else {
            money = balance;
            balance = 0;
        }
        return balance;
    }

}

public class AK_49_PracticeSet {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123456","Rohan");
        acc.depositMoney(1000);
        System.out.println(acc.withdrawMoney(100));
        acc.depositMoney(-50);
        acc.withdrawMoney(0);
    }
}

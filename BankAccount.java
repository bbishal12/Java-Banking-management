
class BankAccount {

    private String accountHolder;
    private String accNum;
    private double balance;

    //created bank acc details
    public BankAccount(String accountHolder, String accNum) {
        this.accountHolder = accountHolder;
        this.accNum = accNum;
        this.balance = 0.0;
    }

    public void deposit(double amt) {
        if(amt<= 0) {
            System.out.println("Depsoit amt must be positive");
            return;

        }
        balance += amt;
        System.out.println("Deposited $" + amt);
    }

    public void withdraw(double amt) {
        if (amt<= 0) {
            System.out.println("Withdrawal amt must be positive");
            return;
        }
        if(amt > balance) {
            System.out.println("Insuuficient fund");
            return;
        }
        balance -= amt;
        System.out.println("With draw $" + amt);
    }

    public void showBalance() {
        System.out.println("current balance: $" + balance);

    }

    public void displayAccInfo() {
        System.out.println("Acc holder:" + accountHolder);
        System.out.println("Acc num:" + accNum);
        showBalance();

    }
}
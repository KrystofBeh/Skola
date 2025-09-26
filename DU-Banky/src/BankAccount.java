public class BankAccount {
    private String accNumber;
    private int balance;

    public BankAccount(String accNumber, int balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public boolean isInDebt(){
        return balance < 0;
    }
}

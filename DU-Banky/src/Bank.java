import java.util.ArrayList;

public class Bank {
    private String code;
    private String name;

    public Bank(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getTotalBalance(ArrayList<BankAccount> bankAccounts){
        int total = 0;
        for (BankAccount acc : bankAccounts) {
            if (acc.getAccNumber().split("/")[1].equals(this.code)) {
                total += acc.getBalance();
            }
        }
        return total;
    }

    public int getClientCount(ArrayList<BankAccount> bankAccounts){
        int count = 0;
        for (BankAccount acc : bankAccounts) {
            if (acc.getAccNumber().split("/")[1].equals(this.code)) {
                count++;
            }
        }
        return count;
    }
}

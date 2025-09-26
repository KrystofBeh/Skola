import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();

        Bank kachnaBank = new Bank("1234", "KachnaBank");
        Human clovek = new Human("Petr", "Bohaty", 16);
        bankAccounts.add(new BankAccount("123456/1234", 10000));
        clovek.addAccount(bankAccounts.get(bankAccounts.size() - 1));

    }

}
import java.util.ArrayList;

public class Human {
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<BankAccount> bankAccounts = new  ArrayList<>();

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void addAccount(BankAccount account) {
        bankAccounts.add(account);
    }
}

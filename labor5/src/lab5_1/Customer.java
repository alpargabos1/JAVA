package lab5_1;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private static int counter = 0;
    private final int id;
    // an array for the accounts
    private ArrayList<BankAccount> accounts = new ArrayList<>();


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.counter++;
        this.id = counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount item : accounts){
            if(item.getAccountNumber().equals(accountNumber)){
                return item;
            }
        }
        return null;
    }

    public int getNumAccounts(){
        return accounts.size();
    }

    public ArrayList<String> getAccountNumbers(){
        ArrayList<String> temp = new ArrayList<>();
        for(BankAccount item : this.accounts){
            temp.add(item.getAccountNumber());
        }
        return temp;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addAccount(BankAccount account) {
        if(account == null) return;
        accounts.add(account);
    }

    public void closeAccount(String accountNumber){
        for (BankAccount item : accounts){
            if(item.getAccountNumber().equals(accountNumber)){
                item = null;
                item = accounts.get(accounts.size()-1);
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(id + ": " + firstName + ' ' + lastName + " accounts:\n");
        for(BankAccount item : accounts){
            result.append( "\t" + item.toString() +"\n");
        }
        return result.toString();
    }
}

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    // an array for the accounts
    private ArrayList<BankAccount> accounts = new ArrayList<>();


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount item : accounts){
            if(item.getAccountNumber().equals(accountNumber)){
                return item;
            }
        }
        return null;
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
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(BankAccount item : accounts){
            result.append( "\t" + item.toString() +"\n");
        }
        return result.toString();
    }
}

package labor3_1;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

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

    public BankAccount getAccount() {
        return account;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public void closeAccount(){
        this.account = null;
    }

    public String toString(){
        if(account == null){
            return String.format("Name: %s %s\nAccount info: NO ACCOUNT",firstName,lastName);
        }
        return String.format("Name: %s %s\n\nAccount info:\n\n%s",firstName,lastName,account.toString());
    }
}

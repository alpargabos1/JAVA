package lab6_1;

public class BankAccount {
    protected double balance;
    protected final String accountNumber;
    public static final String PREFIX = "OTP";
    private static int numAccounts = 0;
    public static final int ACCOUNT_NUMBER_LENGTH = 10;


    protected BankAccount(){
        numAccounts++;
        this.accountNumber = generateAccountNumber();
    }

    private static String generateAccountNumber(){
        StringBuffer helper = new StringBuffer();
        helper.append(PREFIX);
        helper.append(numAccounts);
        while(helper.length() < ACCOUNT_NUMBER_LENGTH){
            helper.insert(3,0);
        }
        return helper.toString();
    }

    //getters
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            return;
        }
        balance += amount;
    }

    public boolean withdraw(double amount){
        if(amount > balance){
            return false;
        }
        balance -= amount;
        return true;
    }

    public String toString(){
        return String.format("Account number: %s\nBalance: %f\n",accountNumber,balance);
    }
}

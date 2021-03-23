package lab6_1;

import lab6_1.BankAccount;

public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest(){
        balance += interestRate * balance;
    }

    @Override
    public String toString() {
        return "lab6_1.CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}

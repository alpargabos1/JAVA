package lab6_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        otpBank();


    }

    private static void otpBank(){
        Bank otp = new Bank("OTP");
        otp.addCustomer(new Customer("Peter", "Griffin"));
        otp.addCustomer(new Customer("Zlatan","Ibrahimovic"));
        otp.getCustomer(1).addAccount(new SavingAccount(0.2));
        otp.getCustomer(1).addAccount(new CheckingAccount(15000));
        otp.getCustomer(2).addAccount(new SavingAccount(0.1));
        otp.getCustomer(2).addAccount(new CheckingAccount(10000));

        Random rand = new Random();
        for(int i=1; i<=otp.getAccountNumbers(); i++) {
            ArrayList <String> ids = otp.getCustomer(i).getAccountNumbers();
            for(String item : ids){
                otp.getCustomer(i).getAccount(item).deposit(rand.nextInt(10000));
            }

        }
        otp.printCustomersToStdout();
    }

    private static void testAccounts(){
        SavingAccount s1 = new SavingAccount(0.1);
        s1.deposit(1500);
        System.out.println(s1.getInterestRate());
        s1.addInterest();
        System.out.println(s1);

        CheckingAccount c1 = new CheckingAccount(10000);
        System.out.println(c1.getOverdraftLimit());
        c1.setOverdraftLimit(11000);
        c1.deposit(5000);
        System.out.println(c1.getOverdraftLimit());
        System.out.println(c1.withdraw(10000));
        System.out.println(c1);
        System.out.println(c1.withdraw(7000));
        System.out.println(c1);
        c1.setOverdraftLimit(50000);
        System.out.println(c1.withdraw(7000));
        System.out.println(c1);
    }
}


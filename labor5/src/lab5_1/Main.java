package lab5_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        partA();
//        partB();
        partC();
    }

    private static void partA() {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        for (int i = 0; i < 150; i++) {
            accounts.add(new BankAccount());
            System.out.println(accounts.get(i).toString());
        }
    }

    private static void partB() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "Black"));
        customers.get(0).addAccount(new BankAccount());
        customers.get(0).addAccount(new BankAccount());
        customers.get(0).addAccount(new BankAccount());
        customers.add(new Customer("Peter", "Griffin"));
        customers.get(1).addAccount(new BankAccount());
        customers.get(1).addAccount(new BankAccount());
        customers.add(new Customer("Balazs", "Dzsudzsak"));
        customers.get(2).addAccount(new BankAccount());
        System.out.println(customers.get(0).toString());
        System.out.println(customers.get(1).toString());
        System.out.println(customers.get(2).toString());
    }

    private static void partC() {
        Bank otp = new Bank("OTP");
        otp.addCustomer(new Customer("Michael", "Schumacher"));
        otp.getCustomer(1).addAccount(new BankAccount());
        otp.getCustomer(1).addAccount(new BankAccount());
        otp.addCustomer(new Customer("Fernando","Alonso"));
        otp.getCustomer(2).addAccount(new BankAccount());
        otp.getCustomer(2).addAccount(new BankAccount());

        System.out.println(otp.getCustomer(1).toString());

        otp.getCustomer(1).getAccount("OTP0000001").deposit(150000);
        otp.getCustomer(1).getAccount("OTP0000002").deposit(50000);
        otp.getCustomer(2).getAccount("OTP0000003").deposit(450000);
        otp.getCustomer(2).getAccount("OTP0000004").deposit(10000);

        System.out.println(otp.getCustomer(2).toString());

        otp.printCustomersToFile("bank_customers.csv");
    }
}

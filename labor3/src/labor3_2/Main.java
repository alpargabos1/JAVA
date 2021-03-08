package labor3_2;

import labor3_1.BankAccount;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alex","HUNTER");
        Customer customer2 = new Customer("Peter","GRIFFIN");

        customer1.addAccount(new BankAccount("OTP00001"));
        customer1.addAccount(new BankAccount("OTP00002"));
        customer1.addAccount(new BankAccount("OTP00003"));
        customer1.addAccount(new BankAccount("OTP00004"));
        customer1.addAccount(new BankAccount("OTP00005"));


        customer2.addAccount(new BankAccount("OTP00006"));
        customer2.addAccount(new BankAccount("OTP00007"));
        customer2.addAccount(new BankAccount("OTP00008"));
        customer2.addAccount(new BankAccount("OTP00009"));
        customer2.addAccount(new BankAccount("OTP00010"));
        customer2.addAccount(new BankAccount("OTP00011"));
        customer2.addAccount(new BankAccount("OTP00012"));
        customer2.addAccount(new BankAccount("OTP00013"));
        customer2.addAccount(new BankAccount("OTP00014"));

        System.out.println(customer1);
        System.out.println(customer2);

        Random rand = new Random();


        customer1.getAccount("OTP00001").deposit(rand.nextInt(5000));
        customer1.getAccount("OTP00002").deposit(rand.nextInt(5000));
        customer1.getAccount("OTP00003").deposit(rand.nextInt(5000));
        customer1.getAccount("OTP00004").deposit(rand.nextInt(5000));
        customer1.getAccount("OTP00005").deposit(rand.nextInt(5000));


        customer2.getAccount("OTP00006").deposit(rand.nextInt(7000));
        customer2.getAccount("OTP00007").deposit(rand.nextInt(7000));
        customer2.getAccount("OTP00008").deposit(rand.nextInt(7000));
        customer2.getAccount("OTP00009").deposit(rand.nextInt(7000));
        customer2.getAccount("OTP00010").deposit(rand.nextInt(7000));
        customer2.getAccount("OTP00011").deposit(rand.nextInt(7000));
        customer2.getAccount("OTP00012").deposit(rand.nextInt(7000));
        customer2.getAccount("OTP00013").deposit(rand.nextInt(7000));
        customer2.getAccount("OTP00014").deposit(rand.nextInt(7000));


        System.out.println(customer1);

        customer1.closeAccount("OTP00001");
        customer2.closeAccount("OTP00014");

        System.out.println(customer1);
        System.out.println(customer2);
    }
}

package labor2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //FELADAT 1

        BankAccount account1 = new BankAccount("OTP00001");
        //System.out.println(account1.toString());
        System.out.println(account1.getAccountNumber() + " : " + account1.getBalance());
        System.out.println("Deposit: 1000 eur");
        if(account1.withdraw(500)){
            System.out.println("Succes!");
        }
        else{
            System.out.println("Not succesful");
        }
        System.out.println(account1.getAccountNumber() + " : " + account1.getBalance());

        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println("Deposit: 2000 eur");
        account2.deposit(2000);
        System.out.println(account2.getAccountNumber() + " : " + account2.getBalance());

        BankAccount account3 = account2;
        System.out.println(account3.getAccountNumber() + " : " + account3.getBalance());

        //FELADAT 2

        Rectangle[] rectangles = new Rectangle[ 10 ];
        Random rand = new Random();
        double counter = 0;

        for(int i=0; i<10; i++) {
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10) ;
            rectangles[ i ] = new Rectangle(length, width);

            System.out.printf("\n%d. rectangle:\n\tlenght - %f\n\twidth - %f\n\tarea = %f\n\tperimeter = %f\n",i + 1,rectangles[i].getLength(),rectangles[i].getWidth(),rectangles[i].area(),rectangles[i].perimeter());
            counter += rectangles[i].area();
        }
        System.out.printf("\n\nTotal area of generated rectangles: %f\n",counter);

        //FELADAT 3

        System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);

        generateDates();


    }

    private static void generateDates(){
        Random rand = new Random();
        int counter = 0;
        for(int i=0; i<1000; i++) {
            MyDate date = new MyDate(rand.nextInt(2021), rand.nextInt(12), rand.nextInt(31));
            if(date.isValidDate()) System.out.println(date.toString());
            else counter++;
        }
        System.out.println("From 1000 generated dates " + counter + " is invalid!");
    }
}

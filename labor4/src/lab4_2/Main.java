package lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        customers = readFromFile("lab4_2_input.txt");
        for (Customer item : customers) {
            System.out.println(item.toString());
        }
    }

    public static ArrayList<Customer> readFromFile(String fileName) {
        ArrayList<Customer> customers = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] items = line.split(",");
            int counter = customers.size();
            if (items[0].trim().equals("Customer")) {
                customers.add(new Customer(items[1].trim(), items[2].trim()));
                //System.out.printf("\n%s %s accounts: \n",customers.get(counter).getFirstName(),customers.get(counter).getLastName());
            }
            if (items[0].trim().equals("Account")) {
                customers.get(counter - 1).addAccount(new BankAccount(items[1].trim()));
                customers.get(counter - 1).getAccount(items[1].trim()).deposit(Double.parseDouble(items[2].trim()));
                //System.out.println(customers.get(counter - 1).toString());
            }

        }
        return customers;
    }
}

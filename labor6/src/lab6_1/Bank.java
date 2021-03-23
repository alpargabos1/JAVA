package lab6_1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    private int accountNumbers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public Customer getCustomer(int customerId){
        for(Customer item : customers){
            if(item.getId() == customerId) return item;
        }
        return null;
    }

    public int getAccountNumbers() {
        return accountNumbers;
    }

    public void addCustomer(Customer c){
        customers.add(c);
        accountNumbers++;
    }

    private void printCustomers( PrintStream ps ){
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ){
            ps.println( customer.getId()+", " + customer.getFirstName() +", "+
                    customer.getLastName()+", "+customer.getNumAccounts());
        }
    }

    public void printCustomersToStdout(){
        printCustomers( System.out );
    }

    public void printCustomersToFile( String filename ){
        try {
            printCustomers( new PrintStream(filename ));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}


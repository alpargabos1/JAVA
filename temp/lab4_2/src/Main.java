import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
    }
    public static ArrayList<Customer> readFromFile(String fileName){
        ArrayList<Customer> customers = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner( new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] items = line.split(",");
            if(items[0] == "Customer"){

            }

        }
        return customers;
    }
}

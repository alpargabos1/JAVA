import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFilePrintItsLineNumbered("lab4_1_input.txt");
        ArrayList<Person> personArrayList = new ArrayList<>();
        readFromCSVFile("lab4_1_input.csv");
    }
    public static void readFilePrintItsLineNumbered( String fileName ){
// Open the file
        Scanner scanner = null;
        try {
            scanner = new Scanner( new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//...
    }

    public static ArrayList<Person> readFromCSVFile(String fileName){
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner( new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] items = line.split(",");
            String firstName = items[0].trim();
            String lastName = items[1].trim();
            int birthYear = Integer.parseInt(items[2].trim());
            Person temp = new Person(firstName,lastName,birthYear);
            System.out.println(temp.toString());
            persons.add(temp);

        }
        return persons;
    }

}

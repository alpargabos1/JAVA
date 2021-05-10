package lab10_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        double counter = 0;
        try {
            scanner = new Scanner(new File("lab10_1_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: lab10_1_input.txt");
            System.exit(1);
        }
        String temp[] = scanner.nextLine().split(" ");

        for (String item : temp) {
            try {
                Double.parseDouble(item);
                counter += Double.parseDouble(item.trim());
            } catch (NumberFormatException e) {
                System.out.println(item + " is not a number!");
            }
        }
        System.out.println(counter);
    }

}

package lab10_2;

import labor2.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("students.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: students.csv");
            System.exit(1);
        }
        try {
            PrintStream writer = new PrintStream("warning.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {
            String fullLine = scanner.nextLine();
            String line[] = fullLine.split(", ");
            try {
                int year, month, day;
                try {
                    year = Integer.parseInt(line[4].trim());
                }
                catch (NumberFormatException e){
                    System.out.println("NUMBER FORMAT EXCEPTION: " + fullLine);
                    continue;
                }
                try {
                    month = Integer.parseInt(line[5].trim());
                }
                catch (NumberFormatException e){
                    System.out.println("NUMBER FORMAT EXCEPTION: " + fullLine);
                    continue;
                }
                try {
                    day = Integer.parseInt(line[6].trim());
                }
                catch (NumberFormatException e){
                    System.out.println("NUMBER FORMAT EXCEPTION: " + fullLine);
                    continue;
                }

                try {
                    if (Integer.parseInt(line[3].trim()) < 30) {
                        try {
                            PrintStream writer = new PrintStream("warning.csv");
                            writer.println(fullLine);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("NUMBER FORMAT EXCEPTION: " + fullLine);
                }

                MyDate date = new MyDate(year,month,day);
                if(!date.isValidDate()){
                    System.out.println("INVALID DATE: " + fullLine);
                    continue;
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("INCOMPLETE LINE: " + fullLine);
            }
        }
    }
}

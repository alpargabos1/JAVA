package lab9_2;

import lab9_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void fire(Employee employee) {
        if (employee != null) {
            employees.remove(employee);
        }
    }

    public void hireAll(String fileName) {
        try {
            File input = new File(fileName);
            Scanner reader = new Scanner(input);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] allData = data.split(",");
                if (allData.length == 6) {
                    Employee emp = new Employee(allData[0], allData[1], Double.parseDouble(allData[2].trim()), new MyDate(Integer.parseInt(allData[3].trim()), Integer.parseInt(allData[4].trim()), Integer.parseInt(allData[5].trim())));
//                    System.out.println(emp);
                    employees.add(emp);
                }
                if (allData.length == 7) {
                    Manager manager = new Manager(allData[0], allData[1], Double.parseDouble(allData[2].trim()), new MyDate(Integer.parseInt(allData[3].trim()), Integer.parseInt(allData[4].trim()), Integer.parseInt(allData[5].trim())), allData[6]);
//                    System.out.println(manager);
                    employees.add(manager);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }

    public void printAll(PrintStream ps) {
        if (employees == null) {
            ps.println("There are no employees!");
            return;
        }
        for (Employee emp : employees) {
            ps.println(emp);
        }
    }

    public void printManagers(PrintStream ps){
        for (Employee man : employees) {
            if(man.getClass() == Manager.class) {
                ps.println(man);
            }
        }
    }

    public void sortByComparator(Comparator<Employee> comp) {
        Collections.sort(employees, comp);
    }

}

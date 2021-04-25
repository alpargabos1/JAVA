package lab9_2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Egyes");
        company1.hireAll("lab9_2_input.txt");
        company1.printAll(System.out);

        System.out.println("\nAlphabetically: ");
        company1.sortByComparator(new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getFirstName().equals(o2.getFirstName()))
                {
                    return o1.getLastName().compareTo(o2.getLastName());
                }
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        company1.printAll(System.out);
        System.out.println();
        company1.printManagers(System.out);
    }
}

package lab9_2;

import lab9_1.MyDate;

public class Manager extends Employee {
    private String department;

    public Manager(String firstName, String lastName, double salary, MyDate birthDate, String name) {
        super(firstName, lastName, salary, birthDate);
        department = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{ID='" + super.getID() + "firstName='" + super.getFirstName() + '\'' + "lastName='" + super.getLastName() + '\'' + "salary='" + super.getSalary() + '\'' + "birthDate='" + super.getBirthDate() +
                "department='" + department + '\'' +
                '}';
    }
}

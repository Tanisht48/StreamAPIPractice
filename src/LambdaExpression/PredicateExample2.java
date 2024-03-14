package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee{
     String name;
     int salary;
     int experience;

    public Employee(String name, int salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
public class PredicateExample2 {
    public static void main(String[] args) {

  List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Grace", 58000, 4));
        employeeList.add(new Employee("Michael", 62000, 6));
        employeeList.add(new Employee("Sophia", 54000, 3));
        employeeList.add(new Employee("Liam", 51000, 2));
        employeeList.add(new Employee("Olivia", 59000, 5));
        employeeList.add(new Employee("Emily", 56000, 3));
        employeeList.add(new Employee("Noah", 53000, 2));
        employeeList.add(new Employee("Ava", 60000, 4));
        employeeList.add(new Employee("Ethan", 59000, 5));
        employeeList.add(new Employee("Isabella", 55000, 3));
        employeeList.add(new Employee("Mason", 61000, 6));
        employeeList.add(new Employee("Emma", 54000, 4));
        employeeList.add(new Employee("Lucas", 52000, 2));
        employeeList.add(new Employee("Aria", 59000, 3));
        employeeList.add(new Employee("Logan", 55000, 4));
        employeeList.add(new Employee("Oliver", 57000, 5));


        Predicate<Employee> pr = e -> e.salary > 30000 && e.experience > 3;

            employeeList.stream().filter(pr).forEach(System.out::println);
    }
}

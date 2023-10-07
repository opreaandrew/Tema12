package ro.fasttrackit.exercise3;

import ro.fasttrackit.exercise2.Person;

import java.util.List;
import java.util.Objects;

public class Employee extends Person {
    private final String company;
    private final Integer salary;

    public Employee(String name, Integer age, String hairColour, String company, Integer salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.getName() + ", " + super.getAge() + ", " + company + ", " + salary + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(company, employee.company) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, salary);
    }
}

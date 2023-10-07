package ro.fasttrackit.exercise3;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMethods {
    private final List<Employee> peeps;

    public EmployeeMethods(List<Employee> peeps) {
        this.peeps = new ArrayList<>(peeps);
    }


    public List<Employee> earnsMoreThan(Integer amount) {
        return peeps.stream().
                filter(person -> person.getSalary() > amount).
                collect(Collectors.toList());
    }

    public Map<String, List<Employee>> peopleForCompany(){
        return peeps.stream().
                collect(Collectors.groupingBy(Employee::getCompany, Collectors.toList()));
    }

    public Integer sumOfAllSalaries(){
        return peeps.stream().
                mapToInt(Employee::getSalary).
                sum();
    }

    public String highestSalary(){
        Optional<Employee> bestPaid = peeps.stream().max(Comparator.comparingInt(Employee::getSalary));
        return bestPaid.map(Employee::getCompany).orElse("No employee found");
    }
}

package ro.fasttrackit;

import ro.fasttrackit.exercise1.*;
import ro.fasttrackit.exercise2.*;
import ro.fasttrackit.exercise3.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
//        Map<Student, Integer> students = new HashMap<>();
//        students.put(new Student("1"), 1);
//        students.put(new Student("2"), 2);
//        students.put(new Student("3"), 3);
//        students.put(new Student("4"), 4);
//        students.put(new Student("5"), 5);
//        students.put(new Student("6"), 6);
//
//        StudentGrades grades = new StudentGrades(students);
//        grades.printAllStudents();
//        System.out.println(grades.studentWithHighestGrade());

        // Exercise 2

//        List<Person> people = List.of(
//                new Person("Alice", 30, "Blonde"),
//                new Person("Bob", 25, "Brown"),
//                new Person("Charlie", 35, "Black"),
//                new Person("David", 40, "Blonde"),
//                new Person("Eve", 28, "Brown")
//        );
//
//        PersonMethods personMethods = new PersonMethods(people);
//
//        System.out.println(personMethods.peopleNames());
//        System.out.println(personMethods.nameToAge());
//        System.out.println(personMethods.olderThan(30));
//        System.out.println(personMethods.hairToName());
//        System.out.println(personMethods.ageToName());

        // Exercise 3

        List<Employee> employees = List.of(
                new Employee("Alice", 30, "Blonde", "CompanyA", 50000),
                new Employee("Bob", 25, "Brown", "CompanyB", 55000),
                new Employee("Charlie", 35, "Black", "CompanyA", 60000),
                new Employee("David", 40, "Blonde", "CompanyB", 62000),
                new Employee("Eve", 28, "Brown", "CompanyA", 52000)
        );

        EmployeeMethods employeeMethods = new EmployeeMethods(employees);

        System.out.println(employeeMethods.earnsMoreThan(52000));
        System.out.println(employeeMethods.peopleForCompany());
        System.out.println(employeeMethods.sumOfAllSalaries());
        System.out.println(employeeMethods.highestSalary());



    }
}
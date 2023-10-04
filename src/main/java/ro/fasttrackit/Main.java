package ro.fasttrackit;

import ro.fasttrackit.exercise1.Student;
import ro.fasttrackit.exercise1.StudentGrades;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
        Map<Student, Integer> students = new HashMap<>();
        students.put(new Student("1"), 1);
        students.put(new Student("2"), 2);
        students.put(new Student("3"), 3);
        students.put(new Student("4"), 4);
        students.put(new Student("5"), 5);
        students.put(new Student("6"), 6);

        StudentGrades grades = new StudentGrades(students);
        grades.printAllStudents();
        System.out.println(grades.studentWithHighestGrade());

        // Exercise 2
    }
}
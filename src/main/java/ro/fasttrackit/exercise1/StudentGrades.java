package ro.fasttrackit.exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentGrades {
    Map<Student, Integer> studentGrades;

    public StudentGrades(Map<Student, Integer> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public void printAllStudents(){
        System.out.println(studentGrades.toString());
    }
    public Student studentWithHighestGrade(){
        Set<Student> students = studentGrades.keySet();
        Student theDude = new Student("");
        int maxGrade = -1;
        for (Student student : students) {
            if(studentGrades.get(student) > maxGrade){
                maxGrade = studentGrades.get(student);
                theDude = student;
            }
        }
        return theDude;
    }
}

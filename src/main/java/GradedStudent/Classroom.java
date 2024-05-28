package GradedStudent;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private Student[] students;


    public Classroom(int maxNumberOfStudents){
    this.students=new Student[maxNumberOfStudents];
    }
    public Classroom(Student[] students) {
        this.students = students;
    }
    public Classroom(){
    this.students=new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public double getAverageExamScores() {
        double sum = 0.0;
        int totalScores = 0;
        for (Student student : students) {
            ArrayList<Double> examScores = student.getExamScores();
            for (Double score : examScores) {
                sum += score;
                totalScores++;
            }

        }System.out.println("The average for all students are:");
        return sum /  totalScores;
    }

    public void addStudent(Student student) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                index = i;
                break;
            }
        }if (index != -1) {
            students[index] = student;
        } else {
            System.out.println("Classroom is full, cannot add more students.");
        }
    }
    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                students[i] = null;
                System.out.println("Student " + firstName + " " + lastName + " removed successfully.");
                return;
            }
        }System.out.println("Student " + firstName + " " + lastName + " not found in the classroom.");
    }



}

package GradedStudent;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("James", "Tegan", new Double[]{95.0, 88.0, 99.0, 79.0, 75.0});
        Student student2 = new Student("Tom", "Logan", new Double[]{100.0, 82.0, 79.0, 55.0, 85.0});
        Student student3 = new Student("Luke", "Max", new Double[]{25.0, 90.0, 49.0, 95.0, 65.0});
        Student student4 = new Student("Edward", "Likely", new Double[]{85.0, 48.0, 99.0, 35.0, 95.0});


        Classroom classroom=new Classroom();
        classroom.setStudents(new Student[]{student1, student2, student3, student4});
        //classroom.getStudents();

        System.out.println(classroom.getAverageExamScores());












    }
}

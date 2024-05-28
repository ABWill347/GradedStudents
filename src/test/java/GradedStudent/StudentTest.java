package GradedStudent;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getExamScores() {
        Student student1 = new Student("James", "Tegan", new Double[]{95.0, 88.0, 99.0, 75.0, 75.0});
        ArrayList<Double> expected= new ArrayList<>();
        expected.add(95.0);
        expected.add(88.0);
        expected.add(99.0);
        expected.add(75.0);
        expected.add(75.0);
        ArrayList<Double> actual=student1.getExamScores();
        assertEquals(expected, actual);
    }

    @Test
    void getAverageExamScore(){
        Student student1 = new Student("James", "Tegan", new Double[]{95.0, 88.0, 99.0, 75.0, 75.0});
        double expected=86.4;
                double actual=student1.getAverageExamScore();
                        assertEquals(expected,actual);
    }
    @Test
    void addExamScore(){
        Student student1 = new Student("James", "Tegan", new Double[]{95.0, 88.0, 99.0, 75.0, 75.0});
        double expected =85.5;
                double actual=student1.addExamScore(85.5);
        assertEquals(expected,actual);
    }




}
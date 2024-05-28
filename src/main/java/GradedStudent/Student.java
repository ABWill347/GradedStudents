package GradedStudent;

import java.util.ArrayList;
import java.util.List;

public class Student {
   private String firstName;
   private String lastName;
   private ArrayList<Double>examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(List.of(testScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getExamScores() {
        System.out.println("Exam Scores for " + getFirstName() + " " + getLastName());
        for (int i = 0; i < examScores.size(); i++) {
            double examScore = examScores.get(i);
            System.out.println( "Exam " + (i + 1) +" -> "+ examScore);
        }
        return examScores ;
    }

    public void setExamScores(int examNumber, Double newScore) {
            examScores.set(examNumber-1,newScore);
    }
    public void getNumberOfExamsTaken(){
        System.out.println("The number of exams taken is "+examScores.size());
    }
    public double addExamScore(double examScore){
        examScores.add(examScore);
        return examScore;
    }
    public double getAverageExamScore(){
        double sum=0.0;
        for (double num:examScores){
            sum+=num;
        }double average = sum/getExamScores().size();
        System.out.printf("The average score for %s %s is %.2f%n", getFirstName(), getLastName(), average);

        return average;
    }

    @Override
    public String toString() {
        return "Student Name:" + firstName + " "
                + lastName  +'\n'+" > Average Score:"+
                getAverageExamScore()+"\n"+" > Exam Scores:"+"\n"+examScores
                ;
    }
}

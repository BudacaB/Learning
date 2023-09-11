
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class PointsHandler {
    
    private ArrayList<Integer> pointsList;
    private ArrayList<Integer> grades;
    
    public PointsHandler() {
        this.pointsList = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void addPoints(int points) {
        if (points < 0) return;
        this.pointsList.add(points);
        if (points < 50) this.grades.add(0);
        else if (points < 60) this.grades.add(1);
        else if (points < 70) this.grades.add(2);
        else if (points < 80) this.grades.add(3);
        else if (points < 90) this.grades.add(4);
        else this.grades.add(5);
    }
    
    public double average() {
        int sum = 0;
        sum = this.pointsList.stream().reduce(sum, Integer::sum);
        
        return sum * 1.0 / this.pointsList.size();
    }
    
    public String passingAverage() {
        int sum = 0;
        sum = this.pointsList.stream()
                .filter(points -> points >= 50)
                .reduce(sum, Integer::sum);
        int passingParticipants = passingParticipants();
        
        double average = sum * 1.0 / passingParticipants;
        
        if (average == 0) return "-";
        return "" + average;
    }
    
    public double passPercentage() {
        int passingParticipants = passingParticipants();
        
        return 100.0 * passingParticipants / this.pointsList.size();
    }
    
    public void gradeDistribution() {
        int grade = 5;
        
        while (grade >= 0) {
            int stars = gradesCount(grade);
            
            System.out.println("");
            System.out.print(grade + ": ");
            if (stars == 0) {
                System.out.print("");
            }
            while (stars > 0) {
                System.out.print("*");
                stars--;
            }
            
            grade--;
        }
    }
    
    private int gradesCount(int gradeType) {
        int count = 0;
        count = this.grades.stream()
                .filter((grade) -> (grade == gradeType))
                .map((_item) -> 1)
                .reduce(count, Integer::sum);
        
        return count;
    }
    
    
    private int passingParticipants() {
        int passingParticipants = 0;
        passingParticipants = this.pointsList.stream()
                .filter((points) -> (points >= 50))
                .map((_item) -> 1)
                .reduce(passingParticipants, Integer::sum);
        
        return passingParticipants;
    }
    
}

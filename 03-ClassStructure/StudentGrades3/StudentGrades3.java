import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades3 {
    String studentName;
    double[] grades;
    int numberOfGrades;
    
    
    StudentGrades3(String name, int numberOfGrades) {
        this.studentName = name;
        this.numberOfGrades = numberOfGrades;
        Scanner scanner = new Scanner(System.in);
        this.grades = new double[numberOfGrades];
        for (int i = 0; i<this.numberOfGrades; i++) {
            
            System.out.println("Enter grade: ");
            // it is important to input doubles with comma (",") not with a dot (".")
            double grade = scanner.nextDouble();
            this.grades[i] = grade;
        }
    }

    public double LowestGrade() {
        double min = this.grades[0];
        for (int i = 1; i<this.grades.length; i++) {
            if (min > this.grades[i]) {
                min = this.grades[i];
            }
        }
        return min;
    }

    public double HighestGrade() {
        double max = this.grades[0];
        for (int i = 1; i<this.grades.length; i++) {
            if (max < this.grades[i]) {
                max = this.grades[i];
            }
        }
        return max;
    }

    public int NumberOfGrades() {
        return this.grades.length;
    }

    public double AverageGrade() {
        double sum = 0;
        for (int i = 0; i<this.grades.length; i++) {
            sum += this.grades[i];
        }

        double result = (sum / NumberOfGrades());
        return result;
    }

    public void DisplayRecord() {
        System.out.println("Student's name: " + this.studentName);
        System.out.println(Arrays.toString(this.grades));
        System.out.println(this.NumberOfGrades());
        System.out.println(this.LowestGrade());
        System.out.println(this.HighestGrade());
        System.out.println(this.AverageGrade());
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        StudentGrades3 student1 = new StudentGrades3("Amanda", 2);

        student1.DisplayRecord();
    }
}
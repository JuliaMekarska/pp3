import java.util.Arrays;
import java.util.Random;


public class StudentGrades2 {
    String studentName;
    double[] grades;
    int numberOfGrades;

    StudentGrades2(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    StudentGrades2(String name, int numberOfGrades) {
        this.studentName = name;
        Random random = new Random();
        this.grades = new double[numberOfGrades];
        for (int i = 0; i < numberOfGrades; i++) {
            this.grades[i] = (double) ((2.0 + ((double) random.nextInt(7))/2));
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
        StudentGrades2 student1 = new StudentGrades2("Amanda", 5);

        student1.DisplayRecord();
    }
}
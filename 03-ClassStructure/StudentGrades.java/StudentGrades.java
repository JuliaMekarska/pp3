import java.util.Arrays;

public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
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
        System.out.println("Grades: " + Arrays.toString(this.grades));
        System.out.println(this.NumberOfGrades());
        System.out.println(this.LowestGrade());
        System.out.println(this.HighestGrade());
        System.out.println(this.AverageGrade());
    }

    public static void main(String[] args) {
        StudentGrades student1 = new StudentGrades("Amanda", new double[] {3.5, 4.5, 2.0,4.0,5.0,3.5,3.5});
        StudentGrades student2 = new StudentGrades("James", new double[] {2.0, 3.0, 2.0, 4.5, 4.5});

        student1.DisplayRecord();
        student2.DisplayRecord();
    }
}

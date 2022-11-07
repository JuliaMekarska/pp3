import java.util.Scanner;

public class Person {
    String name;
    double weight;
    double height;
    double BMI;

    public Person(String name) {
        this.name = name;
    }
    
    public Person(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height; 
    }

    public void setWeightAndHeight(double weight,double height) {
        this.weight = weight;
        this.height = height;
    }
    
    public void calculateBMI() {
        this.BMI = weight / ((height /100) * (height/100));
    }
    
    public void displayRecord() {
        if (this.BMI < 18.5) {
            System.out.println("Name: " + name);
            System.out.println("Weight: " + weight);
            System.out.println("Height: " + height);
            System.out.println("BMI is too low");
        }
        
        else if (this.BMI > 24.9) {
            System.out.println("Name: " + name);
            System.out.println("Weight: " + weight);
            System.out.println("Height: " + height);
            System.out.println("BMI is too high");
        }
        
        else {
            System.out.println("Name: " + name);
            System.out.println("Weight: " + weight);
            System.out.println("Height: " + height);
            System.out.println("BMI: " + BMI);
        }
    }


    public static void main(String[] args){
        Person p1 = new Person("Gosia", 55, 165 );
        Person p2 = new Person("Wiktor", 64, 175 );
        Person p3 = new Person("Malwina", 52, 160 );

        p1.calculateBMI();        
        p2.calculateBMI();
        p3.calculateBMI();

        p1.displayRecord();
        p2.displayRecord();
        p3.displayRecord();
    }
}
public class Student {
    
    //wykaz atrybutow
    String name;
    int age;
    String studentIdCard;
    boolean isValid;
    int semester;
    double averageGrade;
    
    //Wykaz metod
    public void sayHello()
    {
        System.out.println("Hello");  
    };
    public void displayName()
    {
        System.out.println("My name  is " + name);
    };
    public void displayAge()
    {
        System.out.println("My age  is " + age);
    };
    public void displayData1()
    {
        System.out.println(name);
        System.out.println(semester);
        System.out.println(averageGrade);
    };
    public void changeStatus()
    {
        isValid = !isValid;
    };
    public void displayData2()
    {
        System.out.println(name);
        System.out.println(studentIdCard);
        System.out.println(isValid);
    };
    public static void main(String[] args) {
        Student s1 = new Student();  
        s1.name = "Gosia";
        s1.age = 20;
        s1.semester = 3;
        s1.averageGrade = 4.5;
        s1.studentIdCard = "221455";
        s1.isValid = true;
        
        s1.displayData2();
        s1.changeStatus();
        s1.displayData2();
        
    };
    
}

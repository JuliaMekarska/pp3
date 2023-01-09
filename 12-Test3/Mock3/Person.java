public class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;    
    }

    public String toString(){

        return this.name.substring(0,1).toUpperCase() + this.surname.substring(0,1).toUpperCase();
    }

    public static void main(String[] args){
        Person p = new Person("anna", "may");

        System.out.println(p.toString());
    }
}
class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    void setName(String newName) {
        this.name = newName;
    }

    int getAge() {
        return this.age;
    }

    void setAge(int newAge) {
        this.age = newAge;
    }
    
    boolean isAdult() {
        
        if (age >= 18) {
            return true;
        }

        else {
            return false;
        }
    }

    public String toString(){
        return this.name + ", " + this.age;
    }

    public static void main(String[] args){
        Person p = new Person("Anna", 21);
        System.out.println(p.getAge());
        System.out.println(p.isAdult());
        p.setAge(17);
        System.out.println(p.isAdult());
        System.out.println(p.toString());
    }

} 
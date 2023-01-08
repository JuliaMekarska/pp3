public class English extends Person implements Speakable{
    
    public English(String name) {
        setName(name);
    }

    @Override
    public void speak() {
        System.out.print("Good Morning! ");
        System.out.println("My name is " + getName());
    }
}

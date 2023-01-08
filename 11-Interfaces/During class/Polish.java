public class Polish extends Person implements Speakable{
    
    public Polish(String name) {
        setName(name);
    }

    @Override
    public void speak() {
        System.out.print("Dzien dobry! ");
        System.out.println("Nazywam sie " + getName());
    }
}

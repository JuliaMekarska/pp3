
public class Main {
    public static void main(String[] args) {
        SMS s1 = new SMS("Hi","123456789");
        SMS s2 = new SMS("Hi everyone","987654321");

        Email e1 = new Email("Hello world", "Greeting", "amelia@gmail.com");
        Email e2 = new Email("Some information", "Information", "amelia123@gmail.com");

        s1.send();
        s2.send();

        e1.send();
        e2.send();


        System.out.println(s1.charNumber());
        System.out.println(s2.charNumber());

        System.out.println(e1.charNumber());
        System.out.println(e2.charNumber());
    }

}
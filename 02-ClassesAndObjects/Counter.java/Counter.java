public class Counter {
    int initialValue = 0;
    int value = initialValue;
    public void increaseByOne() {
        value ++;
    }

    public void decreaseByOne(){
        value --;
    }

    public void increaseByTen() {
        value += 10;
    }

    public void decreaseByTen() {
        value -= 10;
    }

    public void reset(){
        value = initialValue;
    }

    public void displayData() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        
        counter1.displayData();
        counter1.value = 23;
        
        counter1.displayData();
        counter1.increaseByOne();
        counter1.displayData();
        counter1.decreaseByTen();
        counter1.displayData();
        counter1.reset();
        counter1.displayData();

        Counter counter2 = new Counter();
        counter2.value = -47;
                
        counter2.displayData();
        counter2.increaseByOne();
        counter2.displayData();
        counter2.decreaseByTen();
        counter2.displayData();
        counter2.reset();
        counter2.displayData();
    }
}
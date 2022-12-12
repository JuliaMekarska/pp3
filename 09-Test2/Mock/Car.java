class Car extends Vehicle {
    
    public Vehicle[] data;
    int maxSpeed;

    public Car(int seats, int maxSpeed) {
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec(){
        int[] carSpec = new int[]{getSeats(), maxSpeed};

        return carSpec;
    }

    public static void main(String[] args){
        Car car1 = new Car(5, 190);

        for (int i : car1.spec()) {
            System.out.println(i);
        }   
    }
}

public class AfterClass15 {

    static int numOfItems(int x, int y) {
        return (y-x)+1;
    }

    static int sumOfNum(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++)
            sum = sum + i;
        return sum;
    }

    static double arithmeticMean(int x, int y) {
        double mean = (double) sumOfNum(x, y) / numOfItems(x, y);
        return mean;
    }

    public static void main(String[] args){
        System.out.println(numOfItems(5, 10));
        System.out.println(sumOfNum(5, 10));
        System.out.println(arithmeticMean(5, 10));
    }
}
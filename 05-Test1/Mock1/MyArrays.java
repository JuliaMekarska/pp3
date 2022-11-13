public class MyArrays {
    public static int even(int[] array) {
        int evenNumbers = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenNumbers += 1;
            }
        }
        return evenNumbers;
    }

    public static int positiveOdd(int[] array) {
        int positiveOddNumbers = 0;
        for (int num : array) {
            if (num % 2 != 0 && num > 0) {
                positiveOddNumbers += 1;
            }
        }
        return positiveOddNumbers;
    }

    public static void main(String[] args){
        System.out.println(MyArrays.even(new int[] {2,-6,5,8}));
        System.out.println(MyArrays.even(new int[] {3,2,-5,4,1,-7}));
    }

}

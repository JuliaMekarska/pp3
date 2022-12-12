public class Arrays {
    int[] arr1;
    int[] arr2;

    static boolean arr(int[] arr1, int[] arr2) {

        int counter1 = 0;
        int counter2 = 0;

        for (int num : arr1) {
            if (num >= 10 && num <= 99) {
                counter1 += 1;
            }
        }

        for (int num :arr2) {
            if (num >= 10 && num <= 99) {
                counter2 +=1;
            }
        }

        if (counter1 == counter2) {
            return true;
        }

        else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean array = arr(new int[]{9,6,7,12,48,4,6,90,5}, new int[]{15,8,2,37,49,117});
        System.out.println(array);
    }
}

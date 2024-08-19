package lesson004.lesson03exm1;

public class ArrayUtil {
    public static void inputArray(int[] arr, int from, int to){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (to - from + 1) + from);
        }
    }

    public static void outputArray(int[] arr){

        for (int elem : arr) {
            System.out.print(elem+" ");
        }
        System.out.println();
    }

    public static void changeArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] *= 2;
            }
        }
    }

    public static int negCount(int[] arr){
        int counter = 0;
        for (int elem : arr) {
            if (elem < 0) {
                counter++;
            }
        }
        return counter;
    }
}

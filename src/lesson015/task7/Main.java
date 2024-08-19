package lesson015.task7;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {4, 6, 5};
        int[] arr2 = {};
        int[] arr3 = null;

        try {
            System.out.println(avgArray(arr1));
        } catch (NullPointerException e) {
            System.out.println("arr1 is null");
        } catch (ArithmeticException e) {
            System.out.println("arr1 is empty");
        }

        try {
            System.out.println(avgArray(arr2));//ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("arr2 is null");
        } catch (ArithmeticException e) {
            System.out.println("arr2 is empty");
        }

        try {
            System.out.println(avgArray(arr3));//NullPointerException
        } catch (NullPointerException e) {
            System.out.println("arr3 is null");
        } catch (ArithmeticException e) {
            System.out.println("arr3 is null");
        }
    }

    public static int avgArray(int[] arr) throws NullPointerException, ArithmeticException {
        int sum = 0, avg = 0;

        for (int elem : arr) {//new NullPointerException
            sum += elem;
        }
        avg = sum / arr.length;//new ArithmeticException

        return avg;
    }
}

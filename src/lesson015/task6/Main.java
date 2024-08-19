package lesson015.task6;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {4, 6, 5};
        int[] arr2 = {};
        int[] arr3 = null;

        System.out.println(avgArray(arr1));
        System.out.println(avgArray(arr2));
        System.out.println(avgArray(arr3));

    }

    public static int avgArray(int[] arr) {
        int sum = 0, avg = 0;
        try {
            for (int elem : arr) {
                sum += elem;
            }
            avg = sum / arr.length;
        } catch (NullPointerException exception) {
            System.out.println("array is null");
        }catch (ArithmeticException exception){
            System.out.println("array is empty");
        }
        return avg;
    }

}

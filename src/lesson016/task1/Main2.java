package lesson016.task1;

import lesson016.task1.exceptions.DivideByZeroException;
import lesson016.task1.exceptions.NullDoubleArrayException;
import lesson016.task1.model.MyMath;

public class Main2 {
    public static void main(String[] args) {
        double[] arr1 = {3, 7, 5, 3};
        double[] arr2 = {};
        double[] arr3 = null;

        try {
            System.out.println(MyMath.avgArray2(arr1));
        } catch (NullDoubleArrayException e) {
            e.printStackTrace();
        } catch (DivideByZeroException e) {
            System.out.println("arr1 is empty");
        }

        try {
            System.out.println(MyMath.avgArray2(arr2));
        } catch (NullDoubleArrayException e) {
            System.out.println("arr2 is null");
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(MyMath.avgArray2(arr3));
        } catch (NullDoubleArrayException e) {
            System.out.println("arr3 is null");
        } catch (DivideByZeroException e) {
            System.out.println("arr3 is empty");
        }


    }
}

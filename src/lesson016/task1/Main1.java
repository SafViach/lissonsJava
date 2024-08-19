package lesson016.task1;

import lesson016.task1.model.MyMath;

public class Main1 {
    public static void main(String[] args) {

        double[] arr1 = {3, 7, 5, 3};
        double[] arr2 = {};
        double[] arr3 = null;

        try {
            System.out.println(MyMath.avgArray1(arr1));
        } catch (NullPointerException e) {
            System.out.println("arr1 is null");
        }catch (ArithmeticException e){
            System.out.println("arr1 is empty");
        }

        try {
            System.out.println(MyMath.avgArray1(arr2));
        } catch (NullPointerException e) {
            System.out.println("arr2 is null");
        }catch (ArithmeticException e){
            System.out.println("arr2 is empty");
        }
//exceptions
        try {
            System.out.println(MyMath.avgArray1(arr3));
        } catch (NullPointerException e) {
            System.out.println("arr3 is null");
        }catch (ArithmeticException e){
            System.out.println("arr3 is empty");
        }

    }
}

package lesson004.lesson03exm1;

public class Main5 {
    public static void main(String[] args) {
        //создать массив из 8 элементов, заполнить случайными числами[-50,50],
        // четные элементы увеличить вдвое

        final int SIZE = 8, FROM = -50, TO = 50;
        int[] arr = new int[SIZE];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * (TO - FROM + 1) + FROM);
//        }

        inputArray(arr, FROM, TO);

//        for (int elem : arr) {
//            System.out.print(elem + " ");
//        }
//        System.out.println();
        outputArray(arr);
       // System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                arr[i] *= 2;
//            }
//        }
        changeArray(arr);

//        int counter = 0;
//        for (int elem : arr) {
//            if(elem<0){
//                counter++;
//            }
//        }
        System.out.println("Отриц чисел: "+negCount(arr));

//        for (int elem : arr) {
////            System.out.print(elem + " ");
////        }
////        System.out.println();
        ArrayUtil.outputArray(arr);

    }

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

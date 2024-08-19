package lesson004.lesson03exm1;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 0, -5, 5};

        //length - поля класса, по которому создаются массивы
        //length - кол-во элементов массива на который указывает ссылка
        //arr1.length = 10; нельзя изименить размерность уже существующего массива
        //размер созданного объекта массива изменить нельзя

//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr1[2]);
//        System.out.println(arr1[3]);
//        System.out.println(arr1[4]);

        System.out.println("Вывод элементов в столбик");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("Вывод массива в строку");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();//сбросить курсор на след после массива строку

        System.out.println("перебор элементов с конца к началу");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println("Перебрать не все элементьы массива(со второго до предпоследнего)");
        for (int i = 1; i < arr1.length - 1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 0;//в каждый элемент массива присвоил значение 0
        }

        //foreach - цикл, который перебирает всегда все элементы от начала и до конца
        //используя этот цикл мы не работаем напряму с элементами массива а работаем с ихх копиями
        for (int elem : arr1) {//i = 0   i<arr1.length i++
            //elem = arr1[i] elem - копия каждого элемента
            System.out.print(elem + " ");
        }
        System.out.println();

        //используя foreach нельзя изменять элементы массива примитивов
        for (int elem : arr1) {
            elem = 10;
        }

        for (int elem : arr1) {//i = 0   i<arr1.length i++
            //elem = arr1[i] elem - копия каждого элемента
            System.out.print(elem + " ");
        }
        System.out.println();

        //Arrays - класс содержащий кучу полезных  static методов для работы с массивами
        //Arrays.имя_метода
        //Arrays.toString(массив) - возвращает строковое представление массива (не выводит!!)
        System.out.println(Arrays.toString(arr1));

    }
}

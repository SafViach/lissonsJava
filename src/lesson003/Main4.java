package lesson003;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        //в Java  размер созданного массива - нельзя изменить
        //Добавить?
        //Удалить?

        int[] arr1 = new int[5];
        int from = 1, to = 20;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (to - from + 1) + from);
        }

        System.out.println(Arrays.toString(arr1));
        //Добавить в конец значение 100
        //Arrays.copyOf(стар_мас, новый размер) - создаст новый массив нового размера
        //скопировав и старого необходимое кол-во элементов, вернет адрес нового массива
        arr1 = Arrays.copyOf(arr1, arr1.length + 1);
        arr1[arr1.length - 1] = 100;//arr1.length - 1 индекс последнего элемента
        System.out.println(Arrays.toString(arr1));

        //удалить элемент(ты) из середины
        //System.arraycopy(); native - методы написанные не средствами Java
        //шутсрый метод для копирования
        int delIndex = 3;//по индексу 3 надо удалить элемент
        //System.arraycopy(откуда, поз_откуда, куда, поз_куда, сколько);
        //удалит элемент, но последний элемент будет лдублироваться
        System.arraycopy(arr1, delIndex + 1, arr1, delIndex, arr1.length - delIndex - 1);
        //чтобы избавиться от последнего элемента используем copyOf с указанием уменьшенного на 1 размера
        arr1 = Arrays.copyOf(arr1, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));

    }
}

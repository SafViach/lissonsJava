package lesson010._04_nested;

import lesson010._04_nested.model.Math;

//nested(вложенные классы) - классы описанные внутри других но с ключевым словом static
//объект вложенного класса не имеет связи с объектом внешнего
//вложенные классы имеют доступ только к статик полям внешнего
//где могут пригодиться:
//1) класс который внутри себя логически объединяет набор других классов
//2) когда в одном пакете нужны переменные класса с одинаковым наименованием
//но различным содержимым
public class Main {
    public static void main(String[] args) {
        Math.Factorial factorial1 = new Math.Factorial(5);
        System.out.println(factorial1);
    }
}
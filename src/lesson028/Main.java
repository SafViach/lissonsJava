package lesson028;
public class Main {
    public static void main(String[] args) {

        String str1 = "Мама";
        String str2 = "мыла";
        String str3 = "раму";

        //Из-за множествеенных конкатенаций в heap будет создано множество объектов String
        String str4 = str1 + " " + str2 + " " + str3 + "!";

        //String оьъекты класса неизменяемы, попытка изменения приводит к созданию нового объекта
        //StringBuilder потоконебезопасный
        //StringBuffer потокобезопасный

        //класс для работы со строками, под капотом динамический массив байт, при
        //изменении объета не создает новый а изменяет текущий в том числе увеличивает память

        StringBuilder sb1 = new StringBuilder("12345");
        //перевернуть строку
        String str = "qwerty";
        StringBuilder revStr = new StringBuilder(str);//как из стринг получит стрингбилдер
        revStr.reverse();
        str = revStr.toString();//как из стрингбилдер получить стринг
        
    }
}

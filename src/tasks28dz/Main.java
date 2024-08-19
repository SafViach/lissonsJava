package tasks28dz;

import tasks28dz.task01.ReadingNumbers;
import tasks28dz.task02.ReaderStringJava;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Проверка на соответствие строки номеру мобильного телефона Беларуси при помощи\n" +
                "регулярных выражений. Для каждого из подзаданий создайте отдельное регулярное выражение.\n" +
                "1.1 Номер строго соответствует формату +37529*******\n" +
                "1.2 Между кодом страны, кодом оператора и номером могут быть пробелы\n" +
                "1.3 Коды оператора могут быть 29, 33, 44, 66\n" +
                "1.4 Номера могут начинаться с 80 или +375, например:\n" +
                "8029*******, +375 44 *******, 8 044 *******, +375 66*******");

        final String delimener = File.separator;

        final String FILETASK01 = "src"+delimener+"tasks28dz"+delimener+"data"+delimener+"inOneTask.txt";

        final String REGEX = "((\\+375)|(8\\s*0))\\s*\\(*[29,33,44,66]{2}\\)*\\s*-*\\d{3}(\\s*-*\\d{2}){2}";

        ReadingNumbers rn = new ReadingNumbers(FILETASK01,REGEX);

        rn.read();

        rn.printCollection();

        System.out.println("2. Дана строка: «I study JavaCore, javaSE, JavaEE, javaScript»\n" +
                "2.1 Заполнить ArrayList словами, начинающимися с Java или java\n" +
                "2.2 Заменить в строке все слова начинающиеся с Java или java словом «language»");

        final String FILETASK02 = "src"+delimener+"tasks28dz"+delimener+"data"+delimener+"inTwoTask2.txt";
        final String REGEX2 = "[Jj]ava";
        ReaderStringJava rsj = new ReaderStringJava(FILETASK02,REGEX2);
        rsj.readerFileJava();
        rsj.printListJava();
        System.out.println("замена на Language-------------------------------------");
        final String  STR = "language";
        rsj.replaceWith(STR,REGEX2);
        rsj.printListJava();
                //I study JavaCore, javaSE, JavaEE, javaScript

        
    }
}

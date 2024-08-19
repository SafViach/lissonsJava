package lesson027;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main6 {
    public static void main(String[] args) {
        String regex = "((\\+375)|(8\\s*0))\\s*232\\s*\\d{6}";
        String phone = "8 0 232 123123";

        System.out.println(phone.matches(regex));

        //Pattern Matcher
        //Pattern - класс для создания объектов, котрые хранят регулярку
        Pattern pattern = Pattern.compile(regex);//регулярка воспринимается
        //не как объект стринг, а как объект класса Patter

        //Matcher - класс для создания объектов котррые будут содержать и регулярку и строку
        // для сопоставления с регуляркой

        Matcher matcher = pattern.matcher(phone);//на основании регулярки с троки создается объект matcher

        //matcher.matches() аналогичен методу matches из String
        System.out.println(matcher.matches());

        //matches - всегда проверяет соотвествует ли ВСЯ СТРОКА шаблону регулярки

        try (BufferedReader br = new BufferedReader(new FileReader("src/in6.txt"))) {

            //если в файле одна строка
            String fileLine = br.readLine();//"80232123456 eskhejogfb 8 0232 456456"

            Matcher fileLineMatcher = pattern.matcher(fileLine);//матчер, котрый будет искать
            //совпадения по шаблону в строке файла

            //fileLineMatcher.find() проверяет есть ли в строке подстрока, которая соответствует
            //регулярке

            while (fileLineMatcher.find()) {//пока внутри строки есть  совпадения с регуляркой
                System.out.println(fileLineMatcher.group() + " " + fileLineMatcher.start() + " " + fileLineMatcher.end());//возвращает подстроку, котрая
                //была обнаружена методом find
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //запишем все телефона из файла в коллекцию
        System.out.println("------------------------");
        List<String> phones = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/in6.txt"))) {

            String fileLine = null;

            while ((fileLine = br.readLine()) != null) {

                Matcher fileMatcher = pattern.matcher(fileLine);
                while (fileMatcher.find()){
                    phones.add(fileMatcher.group());
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String ph : phones) {
            System.out.println(ph);
        }

    }
}

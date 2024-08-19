package lesson027;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main8 {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/in8.txt"))) {

            String regex = "^\\s*([A-Z][a-z]{1,10})\\s+(\\d{1,2}\\.?\\d*)\\s*$";

            String fileLine = null;
            Pattern pattern = Pattern.compile(regex);

            while ((fileLine = br.readLine()) != null) {
//                if(fileLine.matches(regex)){
//                    System.out.println(fileLine);
//                }
                Matcher matcher = pattern.matcher(fileLine);
                if(matcher.find()){
                    //части регулярки взятые в круглые скобки имеют свои индексы для matchera
                    //matcher.group(0) " Murzik 3.7   "
                    //matcher.group(1) "Murzik"
                    //matcher.group(2) "3.7"
                    System.out.println(matcher.group(1) + " " + matcher.group(2));
                    cats.add(new Cat(matcher.group(1), Double.valueOf(matcher.group(2))));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Cat cat : cats) {
            System.out.println(cat);
        }

    }
}

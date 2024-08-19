package lesson027;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main7 {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/in7.txt"))) {

            String regex = "-?\\d+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(br.readLine());

            while (matcher.find()) {
                //matcher.group() "45"
                //Integer.valueOf(matcher.group()) 45
                list1.add(Integer.valueOf(matcher.group()));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(list1);

    }
}

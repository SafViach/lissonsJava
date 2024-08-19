package tasks28dz.task01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadingNumbers {
    private String filePath; // путь к файлу
    private String regex; // шаблон по которому ищем номера
    private CollectionForNumbers numbers; // кооллекция которая содержит номера считанные с файла


    public ReadingNumbers(String filePath, String regex) {
        this.filePath = filePath;
        this.regex = regex;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public void printCollection(){
        CollectionForNumbers.printCollection();
    }

    public void read(){
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            Pattern pattern = Pattern.compile(regex);
            String fileLine = null;
            while ((fileLine = br.readLine())!=null){
                Matcher matcher = pattern.matcher(fileLine);
                while (matcher.find()){
                    CollectionForNumbers.add(matcher.group());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ReadingNumbers{" +
                "filePath='" + filePath + '\'' +
                ", regex=" + regex +
                '}';
    }
}

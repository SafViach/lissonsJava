package tasks28dz.task02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReaderStringJava {
    private String filePatch;
    private String regex;

    public ReaderStringJava(String filePatch, String regex) {
        this.filePatch = filePatch;
        this.regex = regex;
    }

    public void add(String str){
        ListJava.add(str);
    }

    public String getFilePatch() {
        return filePatch;
    }

    public void setFilePatch(String filePatch) {
        this.filePatch = filePatch;
    }

    public String getRegex() {
        return regex;
    }


    public void setRegex(String regex) {
        this.regex = regex;
    }

    public void printListJava(){
        ListJava.printArrJava();
    }

    public void readerFileJava(){
        try(BufferedReader br = new BufferedReader(new FileReader(filePatch))){
            String fileLine = null;
            Pattern pattern = Pattern.compile(regex);
            while ((fileLine = br.readLine())!=null){
                Matcher matcher = pattern.matcher(fileLine);
                while (matcher.find()){
                    ListJava.add(matcher.group());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void replaceWith(String str , String regex){
        final String STR = str;
        try (BufferedReader br = new BufferedReader(new BufferedReader(new FileReader(filePatch)))){
            String readFile = null;
            readFile = br.readLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(readFile);
            while(matcher.find()){
                ListJava.add(matcher.replaceAll(STR));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ReaderStringJava{" +
                "filePatch='" + filePatch + '\'' +
                ", regex='" + regex + '\'' +
                '}';
    }
}

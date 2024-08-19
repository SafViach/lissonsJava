package dzTask006;

import dzTask006.model.Chek;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        final String INPUTFILE = "src"+ File.separator+"dzTask006"+File.separator+"data"+File.separator+"input.txt";
        final String OUTPUTFILE = "src"+ File.separator+"dzTask006"+File.separator+"data"+File.separator+"output.txt";

        Chek list = new Chek();

        list.loadFromToFile(INPUTFILE);
        list.saveToFileChek(OUTPUTFILE);

    }
}

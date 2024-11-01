package lesson037;

import lesson035_practic.model.Cat;

import java.util.Scanner;

public class MainException {
    public static void main(String[] args) {
        System.out.println("Please , enter only numbers...");
        try (var sc = new Scanner((System.in))) {
            while (sc.hasNextLine()) {
                try {

                    System.out.println(parseInt(sc.nextLine()));

                } catch (IllegalStateException exception) {
                    System.err.println(exception.getMessage());
                }
            }
        }
    }
    private static int parseInt(String str)throws IllegalStateException{
        try{
            return Integer.parseInt(str);
        }catch (NumberFormatException exception){
            throw new IllegalStateException("Idiot , only numbers!!! You entered " + str);
        }
    }
}

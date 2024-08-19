package lesson027;
public class Main2 {
    public static void main(String[] args) {
        String str = "Давай выпье   по чашечке кофе?     Да,    конечно! Замечательно.";
        String[] words = str.split("[ ?,!.] *");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(words.length);
    }
}

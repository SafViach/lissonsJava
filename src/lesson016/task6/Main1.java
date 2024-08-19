package lesson016.task6;

public class Main1 {
    public static void main(String[] args) {
        try{
            //потенциально опасный код
        }catch (Exception exception){//ловим исключение в ссылку
            //реагируем
        }finally {
            //всегда сработает незвисимо от try и catch
        }
    }
}

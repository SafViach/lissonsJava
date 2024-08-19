package lesson026.task3;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //В файле хранится информация: имена людей и числа - изменения состояний их
        //банковских счетов. Если происходит пополнение счета, то число положительное;
        //если снятие – отрицательное.
        //- Организовать в соответствии с данными в файле хранение информации.
        //- При попытке снятия денежных средств со счета больше имеющихся, на счету
        //оставить значение 0.
        //- Вывести состояние счета по каждому имени после считывания всех операций.
        //Удалить все записи, у кого на счету остался 0.
        //- Использовать реализацию интерфейса Map.
        //Пример файла:
        //Vova 100
        //Dima 150
        //Katya 400
        //
        //Dima 20
        //Vova -50
        //Katya 200
        //Katya -300
        //Katya -300
        //Ivan 150
        //Dima -180

        final String delimeter = File.separator;
        final String INPUT_FILE = "src" +delimeter +"lesson026"+ delimeter + "task3" +
                delimeter + "data" + delimeter + "in.txt";

        Map<String, Double> statusAccounts = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE))) {

            String fileLine = null;

            while ((fileLine = br.readLine()) != null) {//"Vova 100"

                String[] values = fileLine.trim().split(" ");//"Vova", "100"
                String name = values[0];//"Vova"
                Double cash = Double.valueOf(values[1]);//100

                //currentCash - равен null если еще человека нет в мап, либо равен
                //его счету записанному в мап
                Double currentCash = statusAccounts.get(name);// даём ключ и если такого ключа нет то null

                currentCash = currentCash == null ? cash : cash + currentCash;
                currentCash = currentCash <= 0 ? 0 : currentCash;
                statusAccounts.put(name, currentCash);

//                if (currentCash == null) {
//                    statusAccounts.put(name, cash);
//                }else {
//                    statusAccounts.put(name, cash + currentCash);
//                }
                //name  cash
//                Vova 100
//                Dima 150
//                Katya 400
//                Dima 20
//                Vova -50
//                Katya 200
//                Katya -300
//                Katya -300
//                Ivan 150
//                Dima -180
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<String, Double> account : statusAccounts.entrySet()) {
            System.out.println(account.getKey() + " " + account.getValue());
        }

        //нельзя изменять коллекцию во время итерирования
//        for (Map.Entry<String, Double> account : statusAccounts.entrySet()) {
//            if (account.getValue() == 0) {
//                statusAccounts.remove(account.getKey());
//            }
//        }

        //мап представляем в виде сет, где каждый элемент сет - Map.Entry<String, Double>
        //создаем итератор, который позволит пробежаться по коллекции и безопасно удалить чтото из нее по условию
//        Iterator<Map.Entry<String, Double>> iterator = statusAccounts.entrySet().iterator();
//
//        while (iterator.hasNext()) {
//            Map.Entry<String, Double> account = iterator.next();
//            if (account.getValue() == 0) {
//                iterator.remove();
//            }
//        }

        Iterator<Map.Entry<String,Double>> iterator = statusAccounts.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String,Double> elem = iterator.next();
            if (elem.getValue() == 0 ){
                iterator.remove();
            }
        }

        System.out.println("----------------");
        for (Map.Entry<String, Double> account : statusAccounts.entrySet()) {
            System.out.println(account.getKey() + " " + account.getValue());
        }

    }
}

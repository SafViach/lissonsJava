package lesson016.dzTask3;
//3. Создать класс Student с полями имя и средний балл.
//3.1. Предусмотреть обработку исключительных ситуаций при создании объекта с
//некорректными значениями полей, а также при попытке изменить значения полей у
//существующего объекта на некорректные.
//3.2. Имя не должно быть null
//3.3. Имя не должно содержать менее двух символов.
//3.4. Средний балл не может быть отрицательным
//3.5. Средний балл должен быть в диапазоне от 1 до 10.
//3.6. Создать собственные классы исключений: IncorrectNameException,
//
//IncorrectAvgPointException, NegativeAvgPointException, CreateStudentException.
//3.7. В конструкторе с параметрами сгенерировать исключения при получении некорректного
//имени NullPointerException или IncorrectNameException.
//3.8. В конструкторе с параметрами сгенерировать исключения при получении некорректного
//среднего балла NegativeAvgPointException или IncorrectAvgPointException.
//3.9. При наличии исключения отловить его в конструкторе и сгенерировать
//CreateStudentException с указанием причины.
//3.10. В сеттерах сгенерировать соответствующие исключения при получении некорректного
//значения, отловить и сгенерировать(пробросить) IllegalArgumentException с указанием причины
//3.11. В классе Student создать статический метод getStudentFromConsole(), запрашивающий
//информацию(имя и средний балл) у пользователя с клавиатуры и возвращающий объект Student
//в случае корректно введенных данных, иначе генерирующий исключение CreateStudentException

import lesson016.dzTask3.exseption.AvgBallNegativeException;
import lesson016.dzTask3.exseption.AvgNoOneToTenNegative;
import lesson016.dzTask3.exseption.NameLessTwoCharacters;
import lesson016.dzTask3.exseption.NullNameExseption;
import lesson016.dzTask3.model.Student;

public class Main {
    public static void main(String[] args)throws NullNameExseption{
        try {
            Student student1 = new Student("asasd", 0);
            System.out.println(student1);
        }catch (NullNameExseption exseption){
            System.out.println("name null");
        }catch (NameLessTwoCharacters exseption){
            System.out.println("name lass two symbol");
        }catch (AvgBallNegativeException exception){
            System.out.println("avg no negative");
        }catch (AvgNoOneToTenNegative exseption){
            System.out.println("avg no <10 and >1");
        }

        try {
            Student student2 = new Student("Slava",5);
        } catch (NameLessTwoCharacters e) {
            e.printStackTrace();
        } catch (AvgBallNegativeException e) {
            e.printStackTrace();
        } catch (AvgNoOneToTenNegative e) {
            e.printStackTrace();
        }



    }
}

package lesson017.lesson14.task2.model.interfaces;

//интерфейсы могут наследовать друг у друга
//класс, реализующий интерфейс наследника обязан переопредилить все
// методы обоих интерфейсов (play и wag)

public interface IPlay extends IWag{
    void play();
    //void wag()
}

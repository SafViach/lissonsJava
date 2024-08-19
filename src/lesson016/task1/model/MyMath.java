package lesson016.task1.model;

import lesson016.task1.exceptions.CreateFactorialException;
import lesson016.task1.exceptions.DivideByZeroException;
import lesson016.task1.exceptions.NegativeFactorialValueException;
import lesson016.task1.exceptions.NullDoubleArrayException;

public class MyMath {

    public static double avgArray1(double[] arr) {
        double sum = 0, avg = 0;
        //в результате проверок генерируем исключения самостоятельно
        if (arr == null) throw new NullPointerException();
        if (arr.length == 0) throw new ArithmeticException();
        for (double elem : arr) {
            sum += elem;
        }
        avg = sum / arr.length;
        return avg;
    }

    public static double avgArray2(double[] arr) throws NullDoubleArrayException, DivideByZeroException {
        double sum = 0, avg = 0;
        //в результате проверок генерируем исключения самостоятельно
        if (arr == null) throw new NullDoubleArrayException();
        if (arr.length == 0) throw new DivideByZeroException("Деление на 0");
        for (double elem : arr) {
            sum += elem;
        }
        avg = sum / arr.length;
        return avg;
    }


    public static class Factorial {
        private int value;

        public Factorial() {
            value = 1;
        }

        //конструктор должен выбросить исключение о неверном создании объекта
        public Factorial(int value) throws CreateFactorialException {
            try {
                //если пришло отриц число
                if(value<0) throw new NegativeFactorialValueException(value);
                //сгенерировали искл отрицат

            } catch (NegativeFactorialValueException exception) {//тут же его словили
                throw new CreateFactorialException(exception);//и сгенерировали ошибку
                //создания факториала по причине исключения отриц
            }
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) throws NegativeFactorialValueException {
            if (value < 0) throw new NegativeFactorialValueException(value);
            this.value = value;
        }

        //5!  1*2*3*4*5 = 120
        public long calcFactorial() {
            long res = 1;
            for (int i = 2; i <= value; i++) {
                res *= i;
            }
            return res;
        }

        @Override
        public String toString() {
            return "Factorial{" +
                    "value=" + value +
                    ", calcFactorial=" + calcFactorial() +
                    '}';
        }
    }


}

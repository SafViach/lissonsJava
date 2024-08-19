package lesson010._04_nested.model;

public class Math {

    public static class Factorial{
        int x;

        public Factorial(int x) {
            this.x = x;
        }

        public long calcFact(){
            long res = 1;
            for (int i = 2; i <=x ; i++) {
                res = res * i;
            }
            return res;
        }

        @Override
        public String toString() {
            return "Factorial{" +
                    "x=" + x +
                    ", calcFact=" + calcFact() +
                    '}';
        }
    }

}

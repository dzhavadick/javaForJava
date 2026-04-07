public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(75, 85);
        int sumsResult = arithmetic.sumsNumbers();
        System.out.println("Сумма чисел " + sumsResult);

        int multiplicationsResult = arithmetic.multiplicationsNumbers();
        System.out.println("Произведения чисел " + multiplicationsResult);

        int maxResult = arithmetic.maxNumbers();
        System.out.println("Максимальное из двух чисел " + maxResult);

        int minResult = arithmetic.minNumbers();
        System.out.println("Минимальное из двух чисел " + minResult);
    }
}
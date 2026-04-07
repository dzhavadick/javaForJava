public class Arithmetic {
    int numberOne;
    int numberTwo;

    public Arithmetic(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int sumsNumbers() {
        int sums = numberOne + numberTwo;
        return sums;
    }

    public int multiplicationsNumbers() {
        int multiplications = numberOne * numberTwo;
        return multiplications;
    }

    public int maxNumbers() {
        if (numberOne > numberTwo) {
            return numberOne;
        } else {
            return numberTwo;
        }
    }

    public int minNumbers() {
        if (numberOne < numberTwo) {
            return numberOne;
        } else {
            return numberTwo;
        }
    }
}

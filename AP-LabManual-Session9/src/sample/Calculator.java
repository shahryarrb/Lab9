package sample;

/**
 * The sample.Calculator represents a calculator
 */
public class Calculator {

    /**
     * Calculate sum of two numbers
     * @param firstNum a number
     * @param secondNum a number
     * @return sum of two numbers
     */
    public double sum(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    /**
     * Calculate subtract of two numbers
     * @param firstNum a number
     * @param secondNum a number
     * @return subtract of two numbers
     */
    public double subtract(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    /**
     * Calculate multiple of two numbers
     * @param firstNum a number
     * @param secondNum a number
     * @return multiple of two numbers
     */
    public double multiple(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    /**
     * Calculate divide of a number on another
     * @param firstNum a number
     * @param secondNum a number
     * @return divide of a number on another
     */
    public double divide(double firstNum, double secondNum) {
        try {
            return firstNum / secondNum;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return 0;
        }
    }

    /**
     * Calculate pow
     * @param firstNum number
     * @param secondNum pow
     * @return pow
     */
    public double pow(double firstNum, double secondNum) {
        return Math.pow(firstNum, secondNum);
    }

    /**
     * Calculate sqrt of a number
     * @param num a number
     * @return sqrt of a number
     */
    public double sqrt(double num) {
        try {
            return Math.sqrt(num);
        } catch (ArithmeticException e) {
            System.out.println(e);
            return 0;
        }
    }

    /**
     * Calculate sin of a number
     * @param num a number
     * @return sin of number
     */
    public double sin(double num) {
        return Math.sin(num);
    }

    /**
     * Calculate cos of a number
     * @param num a number
     * @return cos of a number
     */
    public double cos(double num) {
        return Math.cos(num);
    }
}

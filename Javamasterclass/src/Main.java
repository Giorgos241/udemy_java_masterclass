import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
      }

    /*
     * Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
     * The method should return boolean, and it needs to return true if two double numbers are the same up to three decimal places. Otherwise,return false.
     */

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        return ((int) (numberOne * 1000) == (int) (numberTwo * 1000));
    }
}
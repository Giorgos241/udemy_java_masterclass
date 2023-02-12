public class Main {
    public static void main(String[] args) {
        checkNumber(1);
    }

    /*PositiveNegativeZero*/
    public static void checkNumber(int number) {
        if (number != 0) {
            System.out.println(number < 0 ? "negative" : "positive");
        } else {
            System.out.println("zero");
        }
    }
}
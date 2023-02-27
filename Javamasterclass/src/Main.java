public class Main {
    public static void main(String[] args) {
        printEqual(1, 1, 3);
    }

    /*
    Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
    If one of the parameters is less than 0, print text "Invalid Value".
    If all numbers are equal print text "All numbers are equal"
    If all numbers are different print text "All numbers are different".

    Otherwise, print "Neither all are equal or different".
    */

    public static void printEqual(int x, int y, int z) {
        System.out.println((x < 0 || y < 0 || z < 0 ? "Invalid Value" : x == y && y == z ? "All numbers are equal" : x != y && y != z && x != z  ? "All numbers are different" : "Neither all are equal or different"));
    }
}
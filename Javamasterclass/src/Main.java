public class Main {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1,1));
      }

    /*
     * The method should return boolean, and it needs to return true if the sum of the first and second parameter is equal to the third parameter.
     * Otherwise, return false.
     */

    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree) {
        return ((numberOne+numberTwo) == numberThree);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99,19));
        System.out.println(isTeen(13));
      }

    /*
     * The method should return boolean, and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
     */

    /*
    * Write another method named isTeen with 1 parameter of type int.
    * The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
    */

    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree) {
        int[] numberArray = {numberOne,numberTwo,numberThree};
        for(int i =0; i<numberArray.length; i++){
            if(numberArray[i] > 12 && numberArray[i] < 20){
                return true;
            }
        }
        return false;
    }

    public static boolean isTeen(int numberOne){
        return (numberOne > 12 && numberOne < 20);
    }
}
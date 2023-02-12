public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, -1));
    }
    /*
    * We have a dog that likes to bark.
    * We need to wake up if the dog is barking at night!
    * Write a method shouldWakeUp that has 2 parameters.
    * 1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
    * 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
    * We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
    */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        //check for barking and check if the hours are between the accepted range (0-23)
        return isTheDogBarking(barking) && checkHoursOfTheDay(hourOfDay) && checkIfWeShouldWakeUpDog(hourOfDay);
    }

    private static boolean isTheDogBarking(boolean barking) {
        return barking ? barking : false;
    }

    /**
     *
     * @param hourOfDay a int that we would like to be between 0-23
     * @return boolean value that will be TRUE if we are between the acceptable range.
     * FALSE if it is lower or greater than our range
     */
    private static boolean checkHoursOfTheDay(int hourOfDay) {
        /*We check that the hourOfDay is between the acceptable range*/
        return (hourOfDay > -1 && hourOfDay < 24) ? checkIfWeShouldWakeUpDog(hourOfDay) : false;
    }

    private static boolean checkIfWeShouldWakeUpDog(int hourOfDay) {
        /*We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true*/
        return (hourOfDay < 8 || hourOfDay > 22) ? true : false;
    }
}
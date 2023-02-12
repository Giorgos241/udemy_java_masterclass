public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 0));
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
        if(barking){
            //check time is of valid range of 0-23
            if(hourOfDay >= 0 && hourOfDay <= 23) {
                //check if we should make the dog stop barking
                return (hourOfDay < 8 || hourOfDay > 22) ? true : false;
            }
        }
        return false;
    }
}
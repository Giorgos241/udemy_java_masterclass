public class Main {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    /*
    Write a method printYearsAndDays with parameter of type long named minutes.
    The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

    If the parameter is less than 0, print text "Invalid Value".
    Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

    XX represents the original value minutes.
    YY represents the calculated years.
    ZZ represents the calculated days.
    */

    public static void printYearsAndDays(long minutes) {
        System.out.println(minutes < 0 ? "Invalid Value" : (minutes + " min = " + (minutes / 525600) + " y and " + ((minutes / 14400) > 365 ? 0 : (((minutes - ((minutes / 525600) * 525600)) / 1440))) + " d"));
    }
}
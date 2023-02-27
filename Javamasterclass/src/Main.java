public class Main {
    public static void main(String[] args) {
        System.out.println(area(5, 4));
        System.out.println(area(-1));
    }

    /*
    Write a method named area with one double parameter named radius.
    The method needs to return a double value that represents the area of a circle.
    If the parameter radius is negative then return -1.0 to represent an invalid value.

    Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
    The method needs to return an area of a rectangle.

    If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
    */

    public static double area(double radius) {
        return (radius < 0 ? -1 : radius * radius * Math.PI);
    }

    public static double area(double x, double y) {
        return (x < 0 || y < 0 ? -1 : x * y);
    }
}
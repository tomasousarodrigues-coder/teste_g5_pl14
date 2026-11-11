package pt.ul.fc;

/** Small utility class. */
public class Toolbox664 {

    /**
     * Returns the larger of first and second.
     */
    public static int maxOf(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns the sum of x and y.
     */
    public static int sum(int x, int y) {
        return x + y;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int absolute(int number) {
        return Math.abs(number);
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double mean(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns n multiplied by 6.
     */
    public static int multiply(int n) {
        return n * 6;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean even(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean greaterThanZero(int number) {
        return number > 0;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int surface(int width, int height) {
        return width * height;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String loud(String word) {
        return word.toUpperCase();
    }
}

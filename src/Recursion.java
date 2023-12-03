import java.util.Scanner;

public class Recursion {

    public static String line (int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + line(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + line(a + 1, b);
        }
    }

    public static void main(String[] args) {

        System.out.println(line(2,4));
        System.out.println(line(8,2));

    }
}

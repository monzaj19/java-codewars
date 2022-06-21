package fundamentials;

/*
* We need a function that can transform a number into a string.

What ways of achieving this do you know?
Examples:

123 --> "123"
999 --> "999"


* */

public class NumberToString {
    public static void main(String[] args) {
        System.out.println(numberToString(3));
    }

    public static String numberToString(int num) {
        return String.valueOf(num);
    }
}

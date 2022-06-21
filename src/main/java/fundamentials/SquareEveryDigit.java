package fundamentials;

/*
* Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer
*/

public class SquareEveryDigit {

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }

    public static int squareDigits(int n){

        String tmp = String.valueOf(n);
        char c;
        int a = 0;
        int val = 0;
        String tmp2 = "";
        String text = "";

        for (int i = 0; i < tmp.length(); i++){
            c = tmp.charAt(i);
            a = Character.getNumericValue(c);
            val = a*a;
            tmp2 = String.valueOf(val);
            text += val;
        }
        int tmp3 = Integer.parseInt(text);

        return tmp3;
    }
}

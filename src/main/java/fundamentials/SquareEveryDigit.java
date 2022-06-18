package fundamentials;

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

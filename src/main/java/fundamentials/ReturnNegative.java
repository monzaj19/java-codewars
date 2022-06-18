package fundamentials;

public class ReturnNegative {
    public static void main(String[] args) {

        System.out.println(makeNegative(42));
    }

    public static int makeNegative(final int x) {

        int value = 0;
        if(x > 0){
            value = x * -1;
        }else if(x <= 0){
            value = x;
        }

        return value;

    }
}

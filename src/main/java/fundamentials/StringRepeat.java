package fundamentials;

public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(6, "Hello"));
    }

    public static String repeatStr(final int repeat, final String string) {
        String s = "";

        for (int i = 0; i < repeat; i++){
            s += string;
        }

        return s;
    }
}
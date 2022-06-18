package fundamentials;

import java.util.ArrayList;
import java.util.List;

public class CounterDuplicateSignInString {
    public static void main(String[] args) {
        System.out.println(encode("Success"));
    }

    public static String encode(String word) {
        char sign;
        List chars = new ArrayList();
        boolean status;
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            sign = word.charAt(i);

            if (chars.contains(sign)) {
                status = true;
            } else {
                chars.add(sign);
                status = false;
            }

            if (status) continue;

            int counter = 0;
            for (int j = 0; j < word.length(); j++) {
                if (sign == word.charAt(j)) {
                    counter++;
                }
            }

            System.out.println(sign + " : " + counter);
        }
        chars.clear();

        return word;
    }
}

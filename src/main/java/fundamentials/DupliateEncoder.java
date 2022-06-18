package fundamentials;

import java.util.ArrayList;
import java.util.List;

public class DupliateEncoder {
    public static void main(String[] args) {
        System.out.println(encode("Prespecialized"));
    }

    public static String encode(String word) {
        char sign;
        String finalWord = "";
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            sign = word.charAt(i);
            Character.toLowerCase(sign);

            int counter = 0;
            for (int j = 0; j < word.length(); j++) {
                if (sign == word.charAt(j)) {
                    counter++;
                }
            }

            if(counter == 1){
                finalWord += "(";
            }else{
                finalWord += ")";
            }
        }

        return finalWord;
    }

}

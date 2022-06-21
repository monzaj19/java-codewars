package fundamentials;

/*
* The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
Examples

"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("

* */

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

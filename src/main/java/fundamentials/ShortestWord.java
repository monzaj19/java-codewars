package fundamentials;

/*
* Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.

* */

import java.util.Arrays;

public class ShortestWord {

    public static void main(String[] args) {
        System.out.println(findShort("mon rt"));
    }

    public static int findShort(String s) {

        s = s + " ";
        String word = "";
        int counter = 0;
        String small = "";
        String tab[] = new String[100];


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word += s.charAt(i);
            } else {
                tab[counter] = word;
                counter++;
                word = "";
            }
        }
        System.out.println("c: "+counter);

        small = tab[0];

        for (int k = 0; k < counter; k++){
            if(small.length() > tab[k].length()){
                small = tab[k];
            }
        }

        int cnt = 0;

        for (int j = 0; j < small.length(); j++){
            cnt++;
        }

        return cnt;
    }
}

package fundamentials;

/*
* Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.

* */

public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(disemvowel("No offense but,\\nYour writing is among the worst I've ever read"));
    }

    public static String disemvowel(String str) {

        str = str.replaceAll("[aioueAIOUE]", "");

        return str;
    }
}

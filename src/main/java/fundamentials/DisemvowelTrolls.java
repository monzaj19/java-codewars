package fundamentials;

public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(disemvowel("No offense but,\\nYour writing is among the worst I've ever read"));
    }

    public static String disemvowel(String str) {

        str = str.replaceAll("[aioueAIOUE]", "");

        return str;
    }
}

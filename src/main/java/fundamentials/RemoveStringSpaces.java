package fundamentials;/*
Simple, remove the spaces from the string, then return the resultant string.
 */

public class RemoveStringSpaces {
    public static void main(String[] args) {
        System.out.println(noSpace("mon ika"));
    }

    public static String noSpace(final String x) {

        String[] parts = x.split(" ");
        String word = "";

        for (int i = 0; i < parts.length; i++){
            word += parts[i];
        }

        return word;
    }
}

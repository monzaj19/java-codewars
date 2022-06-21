package fundamentials;

/*
Write a function that will return the count of distinct case-insensitive
alphabetic characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase)
and numeric digits.
 */


public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("11aaBBcd"));
    }


    public static int duplicateCount(String text) {

        final int NO_OF_CHARS = 256;
        int result = 0;
        int count[] = new int[NO_OF_CHARS];
        for(int i = 0; i < text.length(); ++i){
            char c = text.charAt(i);
            Character.toLowerCase(c);
            count[c]++;
        }
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if(count[i] > 1) {
                result++;
            }
        }
        return result;
    }
}

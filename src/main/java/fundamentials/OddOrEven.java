package fundamentials;/*
Given a list of integers, determine whether the sum of its elements is odd or even.

Give your answer as a string matching "odd" or "even".

If the input array is empty consider it as: [0] (array with a zero).
 */

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[] {1,2,3}));
    }

    public static String oddOrEven (int[] array) {

        int sum = 0;
        String text = "";

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

        if(sum % 2 == 1){
            text = "odd";
        }else {
            text = "even";
        }

        return text;
    }
}

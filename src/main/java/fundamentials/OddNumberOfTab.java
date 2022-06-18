package fundamentials;/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
 */

public class OddNumberOfTab {

    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 2};
        System.out.println(findIt(a));
    }

    public static int findIt(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int counter = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    counter++;
                }
            }
            if (counter % 2 == 1) {
                return a[i];
            }
        }
        return -1;
    }
}

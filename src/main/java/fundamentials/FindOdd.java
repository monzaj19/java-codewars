package fundamentials;

public class FindOdd {

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1,1,2}));
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

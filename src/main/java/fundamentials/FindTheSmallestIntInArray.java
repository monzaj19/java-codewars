package fundamentials;

import java.util.Arrays;

public class FindTheSmallestIntInArray {
    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{34, -345, -1, 100}));
    }

    public static int findSmallestInt(int[] args) {

        int sm = 0;
        Arrays.sort(args);
        sm = args[0];

        //----------------------------------

        int min = args[0];
        for (int i = 0; i < args.length; i++){
            if (args[i] < min){
                min = args[i];
            }
        }



        return min;
    }
}

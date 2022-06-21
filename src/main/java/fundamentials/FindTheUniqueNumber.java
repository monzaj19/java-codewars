package fundamentials;

/*
* There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55

It’s guaranteed that array contains at least 3 numbers.

The tests contain some very huge arrays, so think about performance.
* */

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class FindTheUniqueNumber {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }

    public static double findUniq(double arr[]) {

        boolean isRepeated;
        double val = 0;

        for (int i = 0; i < arr.length; i++) {
            isRepeated = false;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                } else if (arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                val = arr[i];
            }
        }

        return val;
    }
}

//        int leng = arr.length;
//        double val2 = 0, fin = 0;

//        for (int i = 0; i < leng; i++) {
//            val = arr[i];
//            for (int j = 1; j < leng; j++) {
//                val2 = arr[j];
//            }
//            if (val != val2) {
//                fin = val;
//            }
//        }

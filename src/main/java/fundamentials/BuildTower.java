package fundamentials;

import java.util.Arrays;

public class BuildTower {
    public static void main(String[] args) {
        System.out.println(TowerBuilder(3));
    }

    public static String[] TowerBuilder(int nFloors) {

//        String[] tab = new String[nFloors+1];
//
//        if (nFloors > 0) {
//            for (int i = 1; i < nFloors+1; i++) {
//                for (int j = 1; j < i*2; j++) {
//                    tab[i] += "*";
//
////                    System.out.print("*");
//                }
//
//                System.out.println();
//            }
//            for (String s : tab) {
//                System.out.println(s);
//            }
////            System.out.print(Arrays.toString(tab));
//
//
//        }

        int rows = 5, k = 0;
        String[] tab = new String[10];

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                tab[i-1] += "  ";
//                System.out.print(tab[i]);
//                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                tab[i-1] += "* ";
//                System.out.print(tab[i]);
//                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
        for (String s : tab) {
            System.out.println(s);
        }

        return new String[0];
    }
}

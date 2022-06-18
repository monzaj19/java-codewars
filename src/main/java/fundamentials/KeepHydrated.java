package fundamentials;

import static java.lang.Math.floor;
import static java.lang.Math.round;

public class KeepHydrated {

    public static void main(String[] args) {
        System.out.println(Liters(6.7));
    }

    public static int Liters(double time)  {

        int liters = 0;

        liters = (int)Math.floor(time * 0.5);

        return liters;

    }
}

package fundamentials;

public class SumArray {
    public static void main(String[] args) {
        System.out.println(sum(new double[]{1,5.2,4,0,-1}));
    }

    public static double sum(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}

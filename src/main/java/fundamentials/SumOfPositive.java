package fundamentials;

public class SumOfPositive {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,-4,7,12}));
    }

    public static int sum(int[] arr){
        int counter = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                counter += arr[i];
            }
        }

        return counter;
    }
}

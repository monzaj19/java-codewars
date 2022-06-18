package fundamentials;

public class StringToNumber {
    public static void main(String[] args) {

        System.out.println(stringToNumber("506"));
    }

    public static int stringToNumber(String str){

        int tmp = Integer.parseInt(str);

        return tmp;
    }
}

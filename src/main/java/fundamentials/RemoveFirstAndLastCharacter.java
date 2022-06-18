package fundamentials;

public class RemoveFirstAndLastCharacter {

    public static void main(String[] args) {
        System.out.println(remove("Monika"));
    }


    public static String remove(String str) {

        str = str.substring(1, str.length()-1);

        return str;
    }
}

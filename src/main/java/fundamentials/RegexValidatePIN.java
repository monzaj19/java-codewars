package fundamentials;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidatePIN {
    public static void main(String[] args) {
        System.out.println(validatePin("123e"));
    }

    public static boolean validatePin(String pin) {
        String regex = "^([0-9]{4}|[0-9]{6})";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(pin);

        return m.matches();
    }
}

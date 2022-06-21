package fundamentials;

/*
* ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.
Examples (Input --> Output)

"1234"   -->  true
"12345"  -->  false
"a234"   -->  false
* */

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

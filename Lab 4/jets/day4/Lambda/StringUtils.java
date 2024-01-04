package jets.day4.Lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class StringUtils {

    public static String betterString(String s1, String s2, BiPredicate<String, String> checkString) {
        return checkString.test(s1, s2) ? s1 : s2;
    }

    public static boolean containsAlphabetOnly(String str, Predicate<String> checkAlphabet) {
        return checkAlphabet.test(str);
    }
}

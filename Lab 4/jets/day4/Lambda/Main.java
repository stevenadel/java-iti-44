package jets.day4.Lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String string1 = "Hi";
        String string2 = "Hello";

        BiPredicate<String, String> chooseLongerString = (s1, s2) -> s1.length() > s2.length();
        String longer = StringUtils.betterString(string1, string2, chooseLongerString);
        System.out.println(longer);

        String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);
        System.out.println(first);

        String string3 = "Hello123";
        Predicate<String> checkAlphabet = (str) -> {
            boolean isLetter;
            for (Character character : str.toCharArray()) {
                isLetter = Character.isLetter(character);

                if (!isLetter) {
                    return false;
                }
            }
            return true;
        };
        boolean isAlphabet = StringUtils.containsAlphabetOnly(string3, checkAlphabet);
        System.out.println(isAlphabet);
    }
}

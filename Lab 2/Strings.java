package com.jets.lib;

import java.util.StringTokenizer;

public class Strings {
    public static void main(String[] args) {
        String inputString = "Opo opo opa ops opo opa. opq 'opa' test opo oop";
        String targetWord = "opa";

        int wordCount = countWords(inputString, targetWord);
        System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in this string (using String class).");

        int wordCount2 = countWords2(inputString, "opo");
        System.out.println("The word 'opo' appears " + wordCount2 + " times in this string (using String class again).");

        int wordCountToken = countWordsTokenizer(inputString, targetWord);
        System.out.println("The word '" + targetWord + "' appears " + wordCountToken + " times in this string (using Tokenizer).");

        int wordCountRegex = countWordsRegex(inputString);
        System.out.println("There are " + wordCountRegex + " words in this string.");
    }

    private static int countWords(String inputString, String targetWord) {
        int count = 0;
        int index = inputString.indexOf(targetWord);

        while (index != -1) {
            count++;
            index = inputString.indexOf(targetWord, index + 1);
        }
        return count;
    }

    private static int countWords2(String inputString, String wordToCount) {
        String[] words = inputString.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.equals(wordToCount)) {
                count++;
            }
        }
        return count;
    }

    private static int countWordsTokenizer(String inputString, String targetWord) {
        int count = 0;
        StringTokenizer tokenizer = new StringTokenizer(inputString, " .,'");

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.equals(targetWord)) {
                count++;
            }
        }
        return count;
    }

    private static int countWordsRegex(String sentence) {
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
                count++;
        }
        return count;
    }
}

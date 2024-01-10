package com.jets.day5;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SteveMap {
    private final TreeMap<Character, LinkedList<String>> treeMap = new TreeMap<>();

    public void getWords(char letter) {
        LinkedList<String> list = treeMap.getOrDefault(letter, new LinkedList<>());

        if (list.isEmpty()) {
            System.out.println("No words!");
        } else {
            System.out.println(list);
        }
    }
    public void insertWords(LinkedList<String> words) {
        for (String word : words) {
            char key = word.charAt(0);

            LinkedList<String> list;
            if (treeMap.containsKey(key)) {
                list = treeMap.get(key);
            } else {
                list = new LinkedList<>();
            }
            list.add(word);
            treeMap.put(key, list);
        }
    }

    public void removeWord(String word) {
        LinkedList<String> list = treeMap.getOrDefault(word.charAt(0), new LinkedList<>());
        list.remove(word);
        this.insertWords(list);
    }

    public void removeAllKey(char key) {
        treeMap.remove(key);
    }

    public void searchWord(String regex) {
        Set<Map.Entry<Character, LinkedList<String>>> wordsSet = treeMap.entrySet();

        for (Map.Entry<Character, LinkedList<String>> words : wordsSet) {
            for (String word : words.getValue())
                if (word.matches(regex)) {
                    System.out.println("Found match: " + word);
                    return;
                }
        }

        System.out.println("No match found.");
    }

    public void printDictionary() {
        System.out.println(treeMap.entrySet());
    }
}
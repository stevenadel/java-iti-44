package com.jets.day5;

import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
    private final SteveMap dictionary;
    private final Scanner scanner = new Scanner(System.in);

    Menu(SteveMap dictionary) {
        this.dictionary = dictionary;
        showIntro();
        showMenu();
    }

    void showIntro() {
        System.out.println("Welcome to our Java custom words dictionary!");
        System.out.println("This program supports adding, removing and searching for words using a TreeMap internally.");
    }

    void showMenu() {
        System.out.println("\nChoose an operation: ");
        System.out.println("1) Get all words by first letter");
        System.out.println("2) Insert a word into the dictionary");
        System.out.println("3) Remove a word from the dictionary");
        System.out.println("4) Remove all words starting with a letter");
        System.out.println("5) Search if a word is present in the dictionary");
        System.out.println("6) Print all words in the dictionary");
        System.out.println("7) Exit dictionary");

        System.out.print("\nEnter choice: ");
        while (!scanner.hasNextInt()) {
            System.out.print("\nInvalid input. Please enter a number: ");
            scanner.next(); // Consume the invalid input
        }
        runCommand(scanner.nextInt());
    }

     void runCommand(int choice) {
        scanner.nextLine();
         switch (choice) {
             case 1 -> {
                 System.out.print("Enter letter: ");
                 String input = scanner.nextLine();
                 char letter = '\0';
                 if (!input.isEmpty()) {
                     letter = input.charAt(0);
                 }
                 dictionary.getWords(letter);
             }
             case 2 -> {
                 LinkedList<String> list = new LinkedList<>();
                 System.out.print("How many words to insert? ");
                 int wordsCount = scanner.nextInt();
                 scanner.nextLine(); // Consume newline
                 for (int i = 0; i < wordsCount; i++) {
                     System.out.print("\nInsert a word: ");
                     String word = scanner.nextLine();
                     list.add(word);
                 }
                 dictionary.insertWords(list);
             }
             case 3 -> {
                 System.out.print("Enter word: ");
                 String word = scanner.nextLine();
                 dictionary.removeWord(word);
             }
             case 4 -> {
                 System.out.print("Enter letter: ");
                 char key = scanner.nextLine().charAt(0);
                 dictionary.removeAllKey(key);
             }
             case 5 -> {
                 System.out.print("Enter regex: ");
                 String regex = scanner.nextLine();
                 dictionary.searchWord(regex);
             }
             case 6 -> dictionary.printDictionary();
             case 7 -> System.exit(0);
             default -> System.out.println("Invalid choice. Please enter a number between 1 and 7.");
         }
        showMenu();
    }
}

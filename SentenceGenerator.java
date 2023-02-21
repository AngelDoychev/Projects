package Fundametals.Lists;

import java.util.Random;
import java.util.Scanner;

public class SentenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Attila the Hun", "Maximilien Robespierre", "Bloody Mary", "Emperor Hirohito", "Genghis Khan",
                "Genghis Khan", "Muammar Gaddafi", "Ayatollah Khomeini", "Jeffrey Dahmer", "Nero", "Jim Jones", "Saddam Hussein",
                "Leopold II of Belgium", "Osama bin Laden", "Mao Zedong", "Idi Amin Dada", "Idi Amin Dada", "Idi Amin Dada",
                "Judas Iscariot", "Pol Pot", "Elizabeth Bathory", "Adolf Hitler", "Ivan IV", "Joseph Stalin", "Heinrich Himmler"};
        String[] places = {"your home", "An ancient lost city", "the depths of Hell", "your AA meeting", "Syria", "Plovdiv", "Sofia", "prom"
                , "China", "The Americas", "Uranus", "the vacation weekend you had 3 years ago", "back from sunbathing", "last seen alive", "the show Dancing with the stars"};
        String[] verbs = {"bamboozling", "holds", "eats", "sees", "plays with", "brings", "caresses", "strokes", "kisses",
                "devours", "cuts", "stalks", "prepares"};
        String[] nouns = {"the philosopher stones", "a cake", "an apple", " a laptop", "bikes", "a hornets nest", "a thing", "a banana", "a device",
                "a small box of fun", "a big box of fun", "a protein shake", "a spoon", "a chicken wing", "a small child", "something smelly"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly",};
        String[] details = {"near the river", "at home", "in the park", "in your home", "at an amusement festival", "in your car",
                "near your mom", "inside you", "right behind you", "somewhere in the area", "somewhere in the area, but you know because of an amber alert",
                "in a toy store", "on your birthday", "during your wedding ceremony"};
        System.out.println("Hello, this is your first randomly generated sentence: ");
        while (true) {
            String randomName = getWord(names);
            String randomPlace = getWord(places);
            String randomVerb = getWord(verbs);
            String randomNoun = getWord(nouns);
            String randomAdverb = getWord(adverbs);
            String randomDetail = getWord(details);
            System.out.printf("%s from %s %s %s %s %s.%n", randomName, randomPlace, randomAdverb, randomVerb, randomNoun, randomDetail);
            System.out.println("Press [ENTER] to generate a new one.");
            String input = scanner.nextLine();
        }
    }

    public static String getWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }
}

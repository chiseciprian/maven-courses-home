package ro.itschool.mvnbase.homeWorkCurs10.Ex1;

import java.util.ArrayList;
import java.util.List;

public class StringExersises {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("anteroom");
        words.add("antidepressant");
        words.add("circumstance");
        words.add("coworker");
        words.add("demotivate");
        words.add("disintegrate");
        words.add("encode");
        words.add("epicentre");
        words.add("exterminate");
        words.add("extraordinary");
        words.add("forehead");
        words.add("demotivate");

        List<String> prefix = new ArrayList<>();
        prefix.add("ante");
        prefix.add("anti");
        prefix.add("circum");
        prefix.add("co");
        prefix.add("de");
        prefix.add("dis");
        prefix.add("en");
        prefix.add("epi");
        prefix.add("ex");
        prefix.add("extra");
        prefix.add("fore");

        System.out.println(removePrefix(words, prefix));
        System.out.println(uniqString(words));
        System.out.println(concatString(words));
    }

    public static List<String> removePrefix(List<String> words, List<String> prefix) {
        List<String> newWords = new ArrayList<>();
        for (String word : words) {
            for (String pref : prefix) {
                if (word.startsWith(pref)) {
                    newWords.add(word.substring(pref.length()));
                }
            }
        }
        return newWords;
    }

    public static List<String> uniqString(List<String> words) {
        List<String> uniqString = new ArrayList<>();
        for (String element : words){
            if ( !uniqString.contains(element)){
                uniqString.add(element);
            }
        }
        return uniqString;
    }

    public static String concatString(List<String>words){
        String concatWords="";
        for (String elements:words){
            concatWords+=elements;
        }
        return concatWords;
    }
}

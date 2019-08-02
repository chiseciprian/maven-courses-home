package ro.itschool.mvnbase.homeWorkCurs18;

import java.util.ArrayList;

public class Hangman {
    private final String word;
    private  String found;

    public Hangman(String word) {
        this.word = word;
        this.found = generateFoundString(word);
    }

    private String generateFoundString(String word) {
        String foundGenerat="";
        for (int i=0;i<word.length();i++){
            foundGenerat+="_";
        }
        return foundGenerat;
    }

    public String getFound() {
        return found;
    }

    public boolean finished(){
        if (this.found.contains("_")){
            return false;
        }
        return true;
    }

    public boolean guess(Character c){
        String character="";
        character+=c;
        if (this.word.contains(character)){
            fillWordWithFoundChar(c);
            return true;
        }
        else {
            return false;
        }
    }

    private void fillWordWithFoundChar(Character character) {
        ArrayList<Integer>positions=getPositions(character);
        char[]foundWord=this.found.toCharArray();
        for (Integer position:positions){
            foundWord[position]=character;
            this.found=String.valueOf(foundWord);
        }
    }

    private ArrayList<Integer> getPositions(Character character) {
        ArrayList<Integer>positions=new ArrayList<>();
        for (int i=0;i<this.word.length();i++){
            if (word.charAt(i)==character){
                positions.add(i);
            }
        }
        return positions;
    }
}

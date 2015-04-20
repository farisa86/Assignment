package Puzzle;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by jc302404 on 20/04/2015.
 */
public class WordPuzzleGenerator {

    public ArrayList<String> words;

    public WordPuzzleGenerator() {
        words = new ArrayList<String>();


        try {
            Scanner wordscanner = new Scanner(new File("Words.txt"));

            while (wordscanner.hasNext()) {
                words.add(wordscanner.nextLine());

            }
        } catch (Exception e) {

            System.out.println("file is not found");
        }

    }

    public void createWordPuzzle(int size) {
        char[][] result = new char[size][size];

        String[] testWords = new String[size];

        Random randomGenerator = new Random();

        do {

            for (int i = 0; i < testWords.length; i++) {
                do {

                    testWords[i] = words.get(randomGenerator.nextInt(words.size()));
                } while (testWords[i].length() != size);
            }

        } while (checkValidWords(testWords));

        for (String test: testWords){
            System.out.println(test);
        }

    }


    public boolean checkValidWords(String[] testwords) {
        StringBuilder stringBuilder;
        for (int row =0; row < testwords.length;row ++){
            stringBuilder = new StringBuilder();
            for (int column = 0;column<testwords.length; column++){
                stringBuilder.append(testwords[column].charAt(row));
            }
            if (words.contains(stringBuilder.toString())){
                return false;
            }
        }

            return true;
    }
}


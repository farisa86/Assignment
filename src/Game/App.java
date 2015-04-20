package Game;

import Puzzle.WordPuzzleGenerator;

/**
 * Created by jc302404 on 20/04/2015.
 */
public class App {
    public static void main(String[] args) {
        WordPuzzleGenerator generator = new WordPuzzleGenerator();
        generator.createWordPuzzle(3);
//        for(String test: generator.words){
//            System.out.println(test);
//        }
    }

}

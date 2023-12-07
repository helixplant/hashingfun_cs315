/**
 * Implements a word frequency counter using a binary search tree and a heap.
 */

public class WordCounter {

    public static void countWords(String [] words) {
        LPHash lph = new LPHash(words.length);

        lph.createLPH(words);
        lph.printHashTable();

    }

    public static void main(String [] args) {
        String input = "input.txt";
        WordCounter.countWords(InputReader.parseInputFile(input));
    }
}

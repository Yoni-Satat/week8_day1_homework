package codeclan.com.wordcounter.models;

/**
 * Created by user on 13/11/2017.
 */

public class Counter {
    public int getWordsCount(String words) {
        String[] arrayOfWords = words.split(" ");
        return arrayOfWords.length;
    }
}

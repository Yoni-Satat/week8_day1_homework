package codeclan.com.wordcounter;

import org.junit.Test;

import codeclan.com.wordcounter.models.Counter;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/11/2017.
 */

public class CounterTest {

    String testString = "Hello world";
    Counter counter;

    @Test
    public void testCanCountWords() {
        counter = new Counter();
        int actual = counter.getWordsCount(testString);
        assertEquals(2, actual);
    }
}

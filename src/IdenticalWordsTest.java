import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class IdenticalWordsTest {
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("!!!");
        IdenticalWords identicalWords = new IdenticalWords();
        assertEquals(0, identicalWords.check(list));

        list.add("woRLd");
        list.add("HelLO");
        assertEquals(2, identicalWords.check(list));

    }
}
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CountingGameTest {
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        CountingGame<Integer> countingGame = new CountingGame<>();
        countingGame.startGame(list, 2);
        System.out.println(list);

    }
}
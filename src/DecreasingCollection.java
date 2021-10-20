import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecreasingCollection {
    public List<Integer> makeCollection() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Input input = new Input();
            list.add(input.inputNumber());
        }

        list.sort(Collections.reverseOrder());
        return list;
    }
}

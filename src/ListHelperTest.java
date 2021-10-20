import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListHelperTest {
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(4);
        list.add(6);

        ListHelper<Integer> listHelper = new ListHelper<>();
        assertEquals(4, listHelper.check(list));

        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ListHelper<Integer> listHelper1 = new ListHelper<>();
        assertNull(listHelper1.check(list1));
    }
}
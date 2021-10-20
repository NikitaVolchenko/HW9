import org.junit.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {
    @Test
    public void test() {
        List<Integer> list = new List<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        Iterator<Integer> iterator = list.iterator();
        assertTrue(iterator.hasNext());

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                iterator.remove();
            }
            iterator.next();
        }

        int[] array = {1,3, 5, 7, 9};
        assertArrayEquals(array, list.asIntegerArray());

        List<Integer> list1 = new List<>();
        list.add(1);
        Iterator<Integer> iterator1 = list1.iterator();
        assertFalse(iterator1.hasNext());
    }
}
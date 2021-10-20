import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//не работает
public class CountingGame<T> {
    public void startGame(List<T> list, int k) {
        Iterator<T> iterator = list.listIterator();
        while (list.size() > 1) {
            for (int i = 1; i < k; i++) {
                if (iterator.hasNext())
                    iterator.next();
                else {
                    iterator = list.listIterator();
                }
            }
            iterator.remove();
            if (!iterator.hasNext()) {
                iterator = list.listIterator();
            }
        }
    }
}

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListHelper<T> {
    public T check(List<T> list) {
        Set<T> set = new HashSet<>();
        for (T t : list) {
            if (!set.add(t)) {
                return t;
            }
        }
        return null;
    }
}

import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class IdenticalWords {
    public int check(List<String> list) {
        Set<String> set = new HashSet<>();
        int count = 0;
        for (String s : list) {
            if (!set.add(s.toLowerCase(Locale.ROOT))) {
                count++;
            }
        }
        return count;
    }
}

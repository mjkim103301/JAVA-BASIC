package generic.test;

import java.util.Comparator;
import java.util.List;

public class GenericMethodTest {
    public <T> void sort(List<T> list, Comparator<? super T> condition) {
        list.sort(condition);
    }
}

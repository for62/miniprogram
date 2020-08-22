package stream;

import java.util.Arrays;
import java.util.List;

/**
 * 排序
 */
public class StreamAPIDemoD {
    public static void main(String[] args) {
        // sorted()
        List<String> lists = Arrays.asList("bb", "aa", "cc");
        lists.stream().sorted().forEach(System.out::println);
        // sorted(Comparator comparator)
    }
}

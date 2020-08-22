package stream;

import java.util.Arrays;
import java.util.List;

/**
 * 匹配与查找
 */
public class StreamAPIDemoE {
    public static void main(String[] args) {
        // allMathch(Predicate p)：检查是否匹配所有元素
        // anyMatch(Predicate p)：检查是否至少匹配一个元素
        // noneMatch(Predicate p)：检查是否没有匹配元素
        // findFirst 返回第一个元素
        // findAny 返回当前流中的任意元素
        // count 返回流中元素的总个数
        List<String> lists = Arrays.asList("bb", "aa", "cc");
        long count = lists.stream().count();
        System.out.println(count);
        // max(Comparator c)：返回流中最大值
        // min(Comparator c)：返回流中最小值
        // forEach(Consumer c)：内部迭代
    }
}

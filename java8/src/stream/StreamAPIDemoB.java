package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 筛选与切片
 */
public class StreamAPIDemoB {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lists.add(Double.toString(Math.random()));
        }
        Stream<String> stream = lists.stream();
        // filter(Predicate p)：接收Lambda，从流中排除某些元素。
        stream.filter(s -> Double.valueOf(s) > 0.5).forEach(System.out::println);
        System.out.println("**************");
        // limit(n)：截断流，使其元素不超过给定数量。
        lists.stream().limit(2).forEach(System.out::println);
        System.out.println("**************");
        // skip(n)：跳过元素， 返回一个扔掉了前n个元素的流。
        lists.stream().skip(3).forEach(System.out::println);
        System.out.println("**************");
        // distinct()：筛选，通过流所生成元素的hashCode()和equals()去除重复元素
        lists.stream().distinct().forEach(System.out::println);
    }
}

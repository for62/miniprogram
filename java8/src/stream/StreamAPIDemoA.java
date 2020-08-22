package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream API
 * Stream关注的是对数据的运算，与CPU打交道，集合关注的是数据的存储，与内存打交道
 */
public class StreamAPIDemoA {
    public static void main(String[] args) {
        // 创建Stream方式一：通过集合
        List<String> lists = new ArrayList<>();
        // 返回顺序流
        Stream<String> stream = lists.stream();
        // 返回并行流
        Stream<String> stringStream = lists.parallelStream();

        // 创建Stream方式二：通过数组
        String[] strings = new String[10];
        Stream<String> stream1 = Arrays.stream(strings);

        // 创建Stream方式三：通过Stream的of()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

        // 创建Stream方式四：通过无限流（不常用）
        // 迭代
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
        // 生成
        Stream.generate(Math::random).limit(10).forEach(System.out::println);;
    }
}

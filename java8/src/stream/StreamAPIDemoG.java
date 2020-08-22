package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 收集
 */
public class StreamAPIDemoG {
    public static void main(String[] args) {
        // collect(Collector c)：将流转换为其他形式，接收一个Collector接口的实现，用于给Stream中元素做汇总的方法
        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> collect = lists.stream().filter(s -> s > 5).collect(Collectors.toList());
        Iterator<Integer> iterator = collect.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

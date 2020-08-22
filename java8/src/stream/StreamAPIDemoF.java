package stream;

import java.util.Arrays;
import java.util.List;

/**
 * 归约
 * 说明：map和reduce的连接通常称为map-reduce模式
 */
public class StreamAPIDemoF {
    public static void main(String[] args) {
        // reduce(T iden,BinaryOperator b)：可以将流中元素反复结合起来，得到一个值，返回T
        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Integer reduce = lists.stream().reduce(0, Integer::sum);
        System.out.println(reduce);
        // reduce(BinaryOperator b)：可以将流中元素反复结合起来，得到一个值，返回Optional<T>
    }
}

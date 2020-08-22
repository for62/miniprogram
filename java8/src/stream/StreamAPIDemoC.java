package stream;

import java.util.Arrays;
import java.util.List;

/**
 * 映射
 */
public class StreamAPIDemoC {
    public static void main(String[] args) {
        // map(Function f)：接收一个函数作为参数，将元素转成其他形式或提取信息，该函数会被应用到每个元素上，并将其映射成一个新的元素
        List<String> lists = Arrays.asList("aa", "bb", "cc");
        lists.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
        // flatMap(Function f)：接收一个函数作为参数，将流中的每个值都换成另一个流，然后再把流连接成一个流
        // 说明：map(Function f)与flatMap(Function f)的区别类似于add()：将集合元素作为一个整体加入 和 addAll()：将集合中元素逐一加入
    }
}

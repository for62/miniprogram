package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Java内置四大核心函数式接口
 * 1、 消费型：Consumer
 * 2、 供给型：Supplier
 * 3、 函数型：Function
 * 4、 断定型：Predicate
 */
public class LambdaDemoC {
    public static void main(String[] args) {
        testConsumer(200, d -> {
            System.out.println("消费型---" + d);
        });

        Object objSupplier = testSupplier(() -> {
            return "你好";
        });
        System.out.println("供给型---" + objSupplier);

        Integer objFunction = testFunction(50, integer -> integer.intValue());
        System.out.println("函数型---" + objFunction);

        List<String> lists = Arrays.asList("1500", "2500", "3000", "4250");
        List<String> strings = testPredicate(lists, s -> s.contains("3"));
        for (String s : strings) {
            System.out.println("断定型---" + s);
        }

    }

    public static void testConsumer(double d, Consumer consumer) {
        consumer.accept(d);
    }

    public static Object testSupplier(Supplier supplier) {
        if (supplier.get().equals("中国")) {
            return "中国";
        } else {
            return "中国";
        }
    }

    public static Integer testFunction(Integer integer, Function<Integer, Integer> function) {
        if (function.apply(integer) > 100) {
            return integer * 2;
        } else {
            return integer;
        }
    }

    public static List<String> testPredicate(List<String> lists, Predicate<String> predicate) {
        ArrayList<String> filterList = new ArrayList<>();
        for (String s : lists) {
            if (predicate.test(s)) {
                filterList.add(s);
            }
        }
        return filterList;
    }
}

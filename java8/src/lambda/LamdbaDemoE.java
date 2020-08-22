package lambda;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 构造器引用
 *  1、 和方法引用类似
 *  2、 函数式接口的抽象方法的形参列表和构造器的形参列表一致，抽象方法的返回值类型即为构造器所属的类的类型
 * 数组引用
 *  将数组看做一个特殊的类，用法与构造器引用一致
 */
public class LamdbaDemoE {
    public static void main(String[] args) {
        // 构造器引用
        Supplier<String> supplier = String::new;
        System.out.println(supplier.get());

        // 数组引用
        Function<Integer, String[]> function = String[]::new;
        String[] apply = function.apply(12);
        System.out.println(apply.length);
    }
}

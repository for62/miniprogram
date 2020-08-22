package lambda;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * 方法引用
 *  1、 使用情景：
 *      当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用
 *  2、 方法引用：
 *      本质上就是Lambda表达式，而Lambda表达式作为函数式接口的实例，所以方法引用也是函数式接口的实例。
 *  3、 格式：
 *      类（或对象） :: 方法名
 *  4、 具体分为如下三种情况：
 *      1、 对象 :: 非静态方法
 *      2、 类 :: 静态方法
 *
 *      3、 类 :: 非静态方法
 * 5、 方法引用的使用条件：要求接口中的抽象方法的形参列表和返回值类型与方法引用的方法的形参列表与返回值类型相同（主要针对1和2）
 */
public class LambdaDenoD {
    public static void main(String[] args) {
        // 对象 :: 非静态方法
        PrintStream out = System.out;
        Consumer<String> consumer = out::println;
        consumer.accept("你好啊");

        // 类 :: 静态方法
        Comparator<Integer> comparator = Integer::compareTo;
        System.out.println(comparator.compare(21, 12));

        // 类 :: 非静态方法
        Comparator<String> stringComparator = String::compareTo;
        System.out.println(stringComparator.compare("abc", "abm"));
    }
}

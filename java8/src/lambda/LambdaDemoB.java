package lambda;

import java.util.function.Consumer;

/**
 * Lambda表达式的使用
 * 1、 示例：(a,b)->Integer.compare(a,b);
 * 2、 格式
 *      -> :    lambda操作符
 *      ->左边 :  lambda形参列表（接口中的抽象方法的形参列表）
 *      ->右边 ：   lambda体（重写的抽象方法的方法体）
 * 3、 Lambda表达式的使用（6种情况）
 *      1、 无参无返回值
 *          Runnable runnable = () -> System.out.println("我爱北京~");
 *      2、 需要一个参数无返回值
 *          Consumer<String> consumer = (String s) -> {System.out.println(s);}
 *      3、 数据类型可以省略，因为可由编译器推断得出，称为“类型判断”
 *          Consumer<String> consumer = (s) -> System.out.println(s);
 *      4、 Lambda若只需要一个参数时，参数的小括号可以省略
 *          Consumer<String> consumer = s -> System.out.println(s);
 *      5、 Lambda需要两个或两个以上参数，多条执行语句并且可以有返回值
 *          Comparator<Integer> comparator = (a,b)->Integer.compare(a,b);
 *      6、 Lambda体只有一条语句时，return与大括号若有，都可以省略
 *          Consumer<String> consumer = (String s) -> System.out.println(s);
 * 4、 Lambda表达式的本质：作为接口（函数式接口）的实例
 * 5、 如果一个接口中，只声明了一个抽象方法，则此接口就称为函数式接口（@FunctionalInterface）
 */
public class LambdaDemoB {
    public static void main(String[] args) {
        Consumer<String> consumer = (String s) -> System.out.println(s);
        consumer.accept("谎言和誓言~");
    }
}

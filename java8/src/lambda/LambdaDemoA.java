package lambda;

import java.util.Comparator;

public class LambdaDemoA {
    public static void main(String[] args) {
        // 1. Runnable
        Runnable runnable = () -> System.out.println("我爱北京~");
        runnable.run();

        // 2. Comparator-Lambda
        Comparator<Integer> comparator = (a,b)->Integer.compare(a,b);
        int val = comparator.compare(12,43);
        System.out.println(val);

        // 3. Comparator-方法引用
        Comparator<Integer> comparatorFun = Integer::compare;
        int valFun = comparatorFun.compare(12,43);
        System.out.println(valFun);
    }
}

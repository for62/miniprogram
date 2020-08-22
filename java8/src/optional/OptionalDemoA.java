package optional;

import java.util.Optional;

/**
 * Optional
 */
public class OptionalDemoA {
    public static void main(String[] args) {
        String s1 = new String();
        s1 = null;
        Optional<String> s = Optional.ofNullable(s1);
        s.orElse(new String("hello"));
        System.out.println(s.toString());
    }
}

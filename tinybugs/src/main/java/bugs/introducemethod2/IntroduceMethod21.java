package bugs.introducemethod2;

// https://github.com/apache/netbeans/issues/7427

import java.util.List;
import java.util.function.Predicate;

public class IntroduceMethod21 {

    public static void main(String[] args) {
        Predicate<Integer> filter = (t) -> {
            int a = 2; // this seems to work
            return t > 2;
        };
    }
}

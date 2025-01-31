package fixed.in20.unusedhint;

import java.util.Arrays;
import java.util.List;

/**
 * https://github.com/apache/netbeans/pull/6635
 */
record UnusedLocalVarRecord(List<String> list, int[] ints) {

    UnusedLocalVarRecord  {
        list = List.copyOf(list); // WARNING: unused local variable
        ints = Arrays.copyOf(ints, 0); // WARNING: unused local variable
    }
    
    public static void main(String[] args) {
        System.out.println(new UnusedLocalVarRecord(null, null));
    }

}

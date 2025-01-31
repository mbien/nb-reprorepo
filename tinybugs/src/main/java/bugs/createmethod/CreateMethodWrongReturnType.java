package bugs.createmethod;

import java.util.List;
import java.util.function.Function;

/**
 *
 * @author mbien
 */
public class CreateMethodWrongReturnType {
    
    // https://issues.apache.org/jira/browse/NETBEANS-4304
    // Invoking "Create Method" on `doThingWithString`will create a method
    // with the return type of "Function<String, List<Integer>>" instead of "List<Integer>"
    
    public static void kill(){
//        Function<String, List<Integer>> logic =
//                item -> doThingWithString(item, 5, true);
    }

}

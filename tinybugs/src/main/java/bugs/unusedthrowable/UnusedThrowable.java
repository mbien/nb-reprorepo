
package bugs.unusedthrowable;

import java.io.IOException;

/**
 * https://github.com/apache/netbeans/issues/4260
 */
public class UnusedThrowable {
    public static void main(Exception in) throws IOException {
        Throwable cause = in.getCause(); // WARNING: unused local variable
        switch (cause) {
            case IOException ex -> throw ex;
            case Throwable ex -> throw new RuntimeException(ex);
        }
//        throw new RuntimeException(cause);
    }
}

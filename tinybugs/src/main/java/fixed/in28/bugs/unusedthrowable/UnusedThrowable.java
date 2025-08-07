
package fixed.in28.bugs.unusedthrowable;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.rmi.UnexpectedException;

/*
 * https://github.com/apache/netbeans/issues/4260
 * https://github.com/apache/netbeans/pull/8717 fix
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

    public void test2() throws Exception {
        try {
            throw new ReflectiveOperationException();
        } catch (InvocationTargetException ex) {
            switch (ex.getCause()) { // WARNING: the result of throwable returning method is ignored
                case IOException ioe -> throw ioe;
                case Throwable t -> throw new UnexpectedException("?", (Exception) t);
            }
        }
    }
}

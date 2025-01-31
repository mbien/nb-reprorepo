
package bugs.javac.twoinner;

/**
 * https://github.com/apache/netbeans/issues/3667
 */
public class Outer {

    public class Inner {        
    }

// Caused: java.lang.NullPointerException: Cannot invoke "com.sun.tools.javac.code.Type.hasTag(com.sun.tools.javac.code.TypeTag)"
//    because the return value of "com.sun.tools.javac.code.Type.getEnclosingType()" is null


//    public class Inner {
//    }
    
}

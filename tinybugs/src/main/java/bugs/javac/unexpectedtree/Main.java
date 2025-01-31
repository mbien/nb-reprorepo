package bugs.javac.unexpectedtree;

/**
 * https://github.com/apache/netbeans/issues/6822
 */
public class Main {
    
//    Caused: java.lang.AssertionError: Unexpected tree: (ERROR) ? (ERROR) > entry : (ERROR) with kind: CONDITIONAL_EXPRESSION within: (ERROR) ? (ERROR) > entry : (ERROR) with kind: CONDITIONAL_EXPRESSION
//	at com.sun.tools.javac.util.Assert.error(Assert.java:162)
//	at com.sun.tools.javac.comp.Attr$TypeAnnotationsValidator.validateAnnotatedType(Attr.java:5918)
//	at com.sun.tools.javac.comp.Attr$TypeAnnotationsValidator.visitVarDef(Attr.java:5764)
//	at com.sun.tools.javac.tree.JCTree$JCVariableDecl.accept(JCTree.java:1022)
    
    
    // "<?> in the parameter declaration triggers the bug
    public void addEntry(
//            <?> entry 
                    ) {
    }
    
}

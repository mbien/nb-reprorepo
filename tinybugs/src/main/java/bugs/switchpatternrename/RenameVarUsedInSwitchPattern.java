
package bugs.switchpatternrename;

// https://github.com/apache/netbeans/issues/8296
public class RenameVarUsedInSwitchPattern {

    class RenameMe { }
//        ^^^^^^^^

// java.lang.AssertionError: Diff not implemented: PATTERN_CASE_LABEL com.sun.tools.javac.tree.JCTree$JCPatternCaseLabel

    private Object o;

    public void f() {
        switch (o) {
            case RenameMe c -> c.getClass();
            default -> {}
        }
    }
}

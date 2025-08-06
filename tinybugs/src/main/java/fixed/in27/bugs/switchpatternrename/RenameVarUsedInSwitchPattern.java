
package fixed.in27.bugs.switchpatternrename;

// https://github.com/apache/netbeans/issues/8296
// https://github.com/apache/netbeans/pull/8714 (fix)
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

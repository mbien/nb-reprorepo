package fixed.in26.javadocformatting;

// regression since NB 24+
// issue https://github.com/apache/netbeans/issues/8233

/**
 * This is the class comment.
 * It references {@link #addParamHint(int) }.
 * It also references {@link #renameMe() }.
 */
public class RefactoringInfluencesJavadocFormatting {

    /**
     * This is another example.
     * It references {@link #renameMe() }.
     */
    public void addParamHint(int param) {
//                           ^^^ add-param hint should not reformat doc
    }

    /**
     * This is another example.
     * It references {@link #m1() }.
     */
    public void renameMe() {
//              ^^^^rename should not reformat doc
    }
    
}
package bugs.javadoc.markdowndochint;


// https://github.com/apache/netbeans/issues/7827 issue
// https://github.com/apache/netbeans/pull/7491 markdown PR
public class HintIgnoresMarkdownDocOnInsert {

    ///
    /// @param str
    ///
    public static void foo(String str, int i) {}
    //                                 ^^^^^ will insert regular /** */ doc
    
}

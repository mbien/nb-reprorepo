package bugs.parsererror1;

import java.util.ArrayList;

public class ParserAssertionError {
    
    // https://github.com/apache/netbeans/issues/4470 
    
    public static void main(String[] args) {
        
// works
//        ArrayList<Object> arrayList = new ArrayList<>();
        
// assertion error in parser (save file)
// Caused: java.lang.AssertionError: Analyzer error when processing: ArrayList<Object> arrayList = new ArrayList<ArrayList>():java.lang.NullPointerException: Cannot invoke "com.sun.tools.javac.code.Type.isPartial()" because "s" is null

//        ArrayList<Object> arrayList = new ArrayList<ArrayList>();

    }
}

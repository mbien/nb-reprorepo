package lint;

import javax.swing.JFrame;

// fixed via https://github.com/apache/netbeans/pull/7366

/**
 * todo block
 * @author mbien
 */
public class Mavenproject2 {

    //TODO test
    public static void main(String[] args) {
        System.out.println(Runtime.version().major());
        
        if (true);
         
        String s = """
               a
                """;
        System.out.println(s);
        
        new JFrame();
    }

    public String toString() {
        return "Mavenproject2{" + '}';
    }
    
}

package fixed.in22.bugs.imports;

import java.util.ArrayList;
import javax.swing.AbstractAction;

// run ctrl+shift+i
public class OtherClass {
    public static void main(String[] args) {
        System.out.println(javax.swing.AbstractAction.NAME);
    }
}

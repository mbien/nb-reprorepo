package fixed.in28.bugs.switchpatterncolor;

// https://github.com/apache/netbeans/issues/8475
// https://github.com/apache/netbeans/pull/8718 fix

@SuppressWarnings("unused")
public class SwitchPatternFieldColor {
    
    private int field1;
    private int field2;

    private void method(Object obj) {
        switch(obj) {
            case String foo -> {
                field1 = 5;
//              ^^^^^^ wrong color (happens only to first line in block it seems)
                field2 = 10;
                System.out.println(foo);
            }
            default -> {}
        }
    }
}

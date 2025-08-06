package bugs.switchwhenpattern;

// https://github.com/apache/netbeans/issues/8495
@SuppressWarnings("unused")
public class SwithWhenPatternRename {
    record Rec() {
//         ^ rename. Duplicates 'when' section.
    }

    void method(Object o) {
        switch(o) {
            case Integer i when i == 0 -> {
                var r = new Rec();
            }
            default -> {
            }
        }
    }
}

package bugs.introducemethod1;

// https://github.com/apache/netbeans/issues/7428
public class IntroduceMethodOnInstanceof {
    private void foo(Object o) {
        if (o instanceof IntroduceMethodOnInstanceof x) { // select the entire o instanceof X x
            System.out.println(x.toString());
            x.foo(null);
        }
    }
    
    // expected: prevent method extraction
}

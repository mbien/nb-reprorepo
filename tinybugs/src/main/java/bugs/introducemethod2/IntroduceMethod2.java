package bugs.introducemethod2;

// https://github.com/apache/netbeans/issues/7427
public interface IntroduceMethod2 {
    int foo(int a);
    
    IntroduceMethod2 i1 = (a) -> {
        int b = 10;   // try to select Refactor -> introduce method -> invalid selection
        return a + b;
    };
}

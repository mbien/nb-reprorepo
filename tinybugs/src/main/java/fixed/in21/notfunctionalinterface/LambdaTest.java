package fixed.in21.notfunctionalinterface;

/**
 * https://github.com/apache/netbeans/pull/6658
 */
public class LambdaTest {
    
        
    private abstract static class NotFunctionalClass {
        public abstract void a(int i);
    } 
    
    private interface Functional {
        void a(int i);
        default void b(int i) {};
    }
    
    private interface NotFunctional1 {
        default void a(int i) {};
    }
    
    private interface NotFunctional2 {
        default void a(int i) {};
        default void b(float f) {};
    }
    
    private interface DefaultRunnableNotFunctional1 extends Runnable {
//        public void walk();
        @Override public default void run() {}; 
    }
    
    private interface DefaultRunnableNotFunctional2 extends DefaultRunnableNotFunctional1 {
        
    } 

    public static void convertToLambda() {

        Functional f = new Functional() {
            @Override
            public void a(int i) {
            }
        };
        
        NotFunctional2 nf = new NotFunctional2() {
            @Override
            public void a(int i) {
            }
        };

        NotFunctional1 nf2 = new NotFunctional1() { 
            @Override
            public void a(int i) {
            }
        };

        DefaultRunnableNotFunctional1 er = new DefaultRunnableNotFunctional1() { 
            @Override
            public void run() {
            }
        };

        DefaultRunnableNotFunctional2 er2 = new DefaultRunnableNotFunctional2() { 
            @Override
            public void run() {
            }
        };

        NotFunctionalClass nfc = new NotFunctionalClass() {
            @Override
            public void a(int i) {
            }
        };
    }

    
    
}

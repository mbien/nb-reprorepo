package bugs.localtypecompletion;

// https://github.com/apache/netbeans/issues/8436
public class LocalTypeCompletion {

    private record Item1(String name) {}
    private class Item2{} {}
    private enum Item3{} {}

    public void test() {
        
        record Item4(String name) {}
        class Item5{} {}
        enum Item6{} {}

//        new Item
        // first completion contains all 6 Items,
        // hitting ctrl+space again doesn't contain method-local Items
        // as concequence, constructor completion does also not work.
    }
}

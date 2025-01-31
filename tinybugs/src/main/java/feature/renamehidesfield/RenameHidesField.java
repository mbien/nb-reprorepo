package feature.renamehidesfield;

class RenameHidesField {

    // https://github.com/apache/netbeans/issues/7577
    public void method() {
        int outer = 0;
        class InnerClass {
            int inner; // rename to "outer", should the dialog post a "identifier hides a variable" warning?
            public void testmethod2() {
                this.inner = outer;
            }
        }
    }
}

package fixed.in17.misc;

public class RecordEnums {

    /**
     * https://github.com/apache/netbeans/pull/5339
     * @see fixed.misc.RecordEnums. check completion ^^^ should have records
     */
    record ARecord() {
    }

    record UnusedRecord() {
    // mouse over ^^^ should have tooltip
    }

    class AClass {
    }

    public static void main(String[] args) {
        ARecord r = new ARecord();
        //  ^^^ use navigate -> goto implementation
    }
}

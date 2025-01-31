package bugs.move;

public class MoveMethod {

    // this adds "yield" after move which is not valid
    // also visible via show preview
    // related https://issues.apache.org/jira/browse/NETBEANS-5920
    
    private int moveMe() {
        String s = "foo";
        int num = switch (s) {
            case "foo" -> 0;
            case "bar" -> 1;
            default -> -1;
        };
        return num;
    }
}

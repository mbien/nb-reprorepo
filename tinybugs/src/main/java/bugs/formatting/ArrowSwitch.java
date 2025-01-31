package bugs.formatting;

/**
 * https://github.com/apache/netbeans/issues/7326
 */
public class ArrowSwitch {
    public static void main(String[] args) {
        String res = switch(args[0]) {
            case "NORTH" -> "Santa Claus";
            case "SOUTH" -> "Scientist";
            default -> "Agent Smith";
        };
        System.out.println(res);
    }
}

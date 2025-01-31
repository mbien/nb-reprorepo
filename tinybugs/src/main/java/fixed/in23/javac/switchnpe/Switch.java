package fixed.in23.javac.switchnpe;

/**
 * https://github.com/apache/netbeans/issues/5090
 * fixed in 23
 */
class Switch {

    public boolean test(Object value) {
        return switch (value) {
//            case Boolean b -> {    // <- this line added
            default -> false;
        };
    }
}

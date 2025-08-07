package fixed.in24.bugs.renamerecordcomponent;

/// fixed in NB 24.
/// https://github.com/apache/netbeans/pull/7670
public class RenameRecord {

    /**
     * Record.
     */
    private record Vec2d(int x, int y) {
        /**
         * Compact constructor.
         */
        public Vec2d {
            if (x < 0 || y < 0) {
                throw new IllegalArgumentException();
            }
        }
        /**
         * constructor.
         */
        public Vec2d(int x) {
            this(x, 0);
        }
        @Override
        public int x() {
            return x;
        }
    }

    public static void main(String[] args) {

        new Vec2d(1, 1);
        
        Vec2d vec = new Vec2d(1);
        //       rename ^^^^^  (check compact constructor during instant rename)
        //                     (this does work if the record is made public)
        
        System.out.println(vec);
        System.out.println(vec.x);
        System.out.println(vec.x());
        //              rename ^  (doesn't rename component)
        System.out.println(vec.y);
        System.out.println(vec.y());
        //              rename ^  (NPE)
    }

}

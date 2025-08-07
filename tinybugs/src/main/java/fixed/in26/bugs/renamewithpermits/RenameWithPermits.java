package fixed.in26.bugs.renamewithpermits;

// fixed in NB 26
// https://github.com/apache/netbeans/pull/7977
public final class RenameWithPermits implements InterfaceWhichPermits {
//                  ^^^ rename and check if renamed in interface

    @Override
    public void a() {
    }
    
    non-sealed class RenameInnerWithPermits implements InterfaceWhichPermits {
        @Override
        public void a() {
        }
    }
}

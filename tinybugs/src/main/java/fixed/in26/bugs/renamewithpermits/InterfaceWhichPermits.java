package fixed.in26.bugs.renamewithpermits;

sealed interface InterfaceWhichPermits permits RenameWithPermits, RenameWithPermits.RenameInnerWithPermits {
    public void a();
}

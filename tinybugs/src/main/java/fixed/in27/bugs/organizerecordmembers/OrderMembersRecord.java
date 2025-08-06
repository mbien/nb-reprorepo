package fixed.in27.bugs.organizerecordmembers;

import java.awt.Color;

// https://github.com/apache/netbeans/pull/8220 fix

// enable formatter setting: ordering -> alphabetical member sort
// run "orgamize members"
// this should not influence record components
public record OrderMembersRecord(Color borderColor, double borderSize, int width, int height) {

    public static int c;
    public static int b;
    public static int d;
    public static int a;

}

package bugs.organizerecordmembers;

import java.awt.Color;

// enable formatter setting: ordering -> alphabetical member sort
// this should not influence record components
public record OrderMembersRecord(Color borderColor, double borderSize, int width, int height) {
    
    public static int c;
    public static int b;
    public static int d;
    public static int a;

}

package bugs.refresh;

import org.junit.jupiter.api.Test;

public class RefreshBugTest {
    
    // https://github.com/apache/netbeans/issues/6725
    
    @Test
    public void testMain() {
        // without module-info (move file somewhere else):
        // rename method -> editor should refresh
        
        // with module-info:
        // rename again -> editor does not refresh
        // clean build fixes it
        RefreshBug.rename2();
    }
    
}

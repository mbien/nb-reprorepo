package fixed.in22.importsbug;

import java.math.BigDecimal;

/**
 *
 * @author mbien
 */
public class Importsbug {
    // fixed in NB 22 https://github.com/apache/netbeans/pull/7363
    public static void main(String[] args) {
        new BigDecimal(1);   // run fix imports action
    }
}

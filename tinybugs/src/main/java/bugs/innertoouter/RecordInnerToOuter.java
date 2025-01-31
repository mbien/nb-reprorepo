package bugs.innertoouter;

import java.time.LocalDate;

// https://github.com/apache/netbeans/issues/7044
public class RecordInnerToOuter {

    // move inner to outer
    public record Studentje(int id, String fullName, LocalDate dob) {

    }

}

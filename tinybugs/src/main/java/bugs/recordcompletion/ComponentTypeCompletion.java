package bugs.recordcompletion;

import java.time.Instant;

public record ComponentTypeCompletion(String s, Instant timestamp) {}
//                                                     ^    use auto completion
// this will import InstantSource, "Instant" is not in the list

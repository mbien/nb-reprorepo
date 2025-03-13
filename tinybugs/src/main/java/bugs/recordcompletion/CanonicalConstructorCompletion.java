
package bugs.recordcompletion;

// https://issues.apache.org/jira/browse/NETBEANS-6377
public record CanonicalConstructorCompletion(int x, String s) {
     // ctrl space should offer constructors
}

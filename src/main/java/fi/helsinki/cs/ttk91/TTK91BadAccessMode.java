/*
 * Created on Mar 17, 2004
 */
package fi.helsinki.cs.ttk91;

/*
 * See separate documentation in yhteisapi.pdf in the javadoc root.
 */
public class TTK91BadAccessMode extends TTK91RuntimeException {
    public TTK91BadAccessMode(String message) {
        super(message);
    }
}

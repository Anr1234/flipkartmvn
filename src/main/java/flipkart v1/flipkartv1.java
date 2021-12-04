package flipkart v1;

import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;


/**
 * Displays the last log entries
 */
@Command(scope = "v", name = "flipkartv1", description = "v")
public class flipkartv1 extends OsgiCommandSupport {

    protected Object doExecute() throws Exception {
         System.out.println("Executing command flipkartv1");
         return null;
    }
}

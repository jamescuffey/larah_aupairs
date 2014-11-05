package larah.aupairs.client.tools.developer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import larah.aupairs.client.Constants;

/**
 *
 * @author James
 */
public class Logger {

    /**
     * The date format string.
     */
    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
    

    /** 
     * Print a log message. 
     * @param message 
     */
    public static void log(String message) {
        if (message == null) {
            return;
        }
        System.out.println("[" + dateFormat.format(new Date()) + "][" + Constants.APPLICATION_NAME + "]: " + message); 
    } 
    
}

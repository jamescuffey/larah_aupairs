package larah.aupairs.client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author James
 */
public class Utilities {

    public static void generateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        Main.labelDate.setText("Local time: " + dateFormat.format(date));         
    }
    
}

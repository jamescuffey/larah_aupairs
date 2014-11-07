package larah.aupairs.client;

import larah.aupairs.client.frames.Main;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import org.nikkii.alertify4j.Alertify;
import org.nikkii.alertify4j.AlertifyBuilder;
import org.nikkii.alertify4j.AlertifyType;

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

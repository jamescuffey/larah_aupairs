package larah.aupairs.client;

import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.net.URL;
import larah.aupairs.client.frames.Main;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import larah.aupairs.client.frames.alert.impl.*;

/**
 *
 * @author James
 * 
 * A set of utilities used within the application.
 */
public class Utilities {
    
    //stop instantation of this class.
    private Utilities() {
        
    }

    public static void generateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        Main.labelDate.setText("Local time: " + dateFormat.format(date));                  
    }
    
    public static void setTrayIcon() {
        PopupMenu popup = new PopupMenu();
        URL url = System.class.getResource(Constants.ABSOLUTE_PATH);
        Image img = Toolkit.getDefaultToolkit().getImage(url);
        final TrayIcon trayIcon = new TrayIcon(img, "Larah aupairs", popup);
    }
    
    /**
     * Sets an alert.
     * @param alert 
     */
    public static void setAlert(int alert) {
        switch(alert) {
            case 1:
                new CompleteAction().displayAlert();
                break;
            case 2:
                new ResourcesAlert().displayAlert();
                break;
            default:
                System.out.println("This alert doesn't exist.");
        }
    }
}

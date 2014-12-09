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
import java.util.Random;
import larah.aupairs.client.frames.alert.impl.*;

/**
 *
 * @author James
 * 
 * A set of utilities used within the application.
 */
public class Utilities {
    
    
    /**
     * Construct a new instance of the rights enumeration.
     */
    public static RIGHTS rights = RIGHTS.USER;
    
  
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
            case 3:
                new PersonnelAlert().displayAlert();
                break;
            default:
                System.out.println("This alert doesn't exist.");
        }
    }
    
    /**
     * Creates what account type the user is.
     * @param parser 
     */
    public static void setAccountType(String parser) {
        for(int i = 0; i < Constants.ADMINISTRATORS.length; i = i + 1) {
            if(parser.equals(Constants.ADMINISTRATORS[i])) {
               // getRights().setSystemRights(1);
                rights.setRights(1);
                System.out.println("Administrative personnel accessed the system.");         
            } else {
                //getRights().setSystemRights(0);
                rights.setRights(1);
                System.out.println("Non-administrative personnel accessed the system.");
            }

        }
    }
    
    /**
     * Generates a new key per entity.
     * @param key
     * @param min
     * @param max
     * @return key
     */
    public static int generateUID(int key, int min, int max) {
        Random random = new Random();
        if(key != 0) {
            key = random.nextInt((max - min) + 100) + min;
        }
        return key;
    }
   
    /**
     * Stores our rights in the enumeration.
     */
    public enum RIGHTS {
       USER(0),
       AMINISTRATOR(1),
       DEVELOPER(2);
       
       private int rights;
       
       RIGHTS(int rights) {
           this.rights = rights;
       }
       
       public int getRights() {
           return rights;
       }
       
       public String getName() {
           return Utilities.rights.toString();
       }
       
       public int setRights(int rights) {
           return this.rights = rights;
       }
    }
    
    
    
}

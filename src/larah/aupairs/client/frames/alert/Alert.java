package larah.aupairs.client.frames.alert;

import javax.swing.Icon;
import larah.aupairs.client.frames.alert.impl.CompleteAction;
import larah.aupairs.client.frames.alert.impl.ResourcesAlert;
import org.nikkii.alertify4j.AlertifyType;

/**
 *
 * @author James
 */
public abstract class Alert {
    
    /**
     * The method to handle the display of alerts.
     */
    public abstract void displayAlert();
    
    /**
     * The icon used to represent the alert.
     * @return icon
     */
    public abstract Icon action();
    
    /**
     * The path of the icon.
     * @return path
     */
    public abstract String path();
    
    /**
     * The text on the alert.
     * @return ""
     */
    public abstract String text();
    
    /**
     * The type of alert.
     * @return type
     */
    public abstract AlertifyType type();
    
    /**
     * The timer for the alert.
     * @return 0
     */
    public abstract int timer();  
    
    /**
     * Sets the alert.
     * @param alertType 
     */
    public static void setAlert(int alertType) {
        switch(alertType) {
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

package larah.aupairs.client;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author James
 * 
 * A class which holds all of the constants.
 */
public class Constants {
    
    /**
     * Stop instantiation of this class.
     */
    private Constants() {
        
    }   
    
    /**
     * The name of the application.
     */
    public static final String APPLICATION_NAME = "Larah aupairs";

    /**
     * The gif used for the loading interface.
     */
    public static final ImageIcon loading = new ImageIcon("images/ajax-loader.gif");
    
    /**
     * The version of the aupair form.
     */
    public static final double AUPAIR_VERSION = 1.0;
    
    /**
     * The version of the family form.
     */
    public static final double FAMILY_VERSION = 1.0;
    
    /**
     * Our file name to hold the data.
     */
    public static final String FILE_NAME = "login_data.cfg";
    
    /**
     * Checks whether the application is in debug mode.
     */
    public static boolean DEBUG_MODE = true;

    /**
     * The path to the icon used to represent the successful action.
     */
    public static final String SUCCESSFUL = "images/success.png";
    
    /**
     * The icon used to represent the successful action.
     */
    public static final Icon SUCCESSFUL_ACTION = new ImageIcon(SUCCESSFUL);
    
   /**
     * The path to the icon used to represent the spanner action.
     */
    public static final String SPANNER = "images/spanner.png";
    
    /**
     * The icon used to represent the spanner action.
     */
    public static final Icon SPANNER_ACTION = new ImageIcon(SPANNER);

}

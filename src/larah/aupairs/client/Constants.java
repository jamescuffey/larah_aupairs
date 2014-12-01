package larah.aupairs.client;

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
   //public static final ImageIcon loading = new ImageIcon("images/ajax-loader.gif");
      
    /**
     * The path for the tray icon image.
     */
    public static final String ABSOLUTE_PATH = "images/salutation.png";
    
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
    public static boolean DEBUG_MODE = false;
    
    /**
     * All of our administrators within the system.
     */
    public static final String[] ADMINISTRATORS = {"nicola"};
    
    /**
     * The rights within the system.
     * 
     * 0 = regular user
     * 1 = administrator
     * 
     */
    public static final int SYSTEM_RIGHTS = -1;
}

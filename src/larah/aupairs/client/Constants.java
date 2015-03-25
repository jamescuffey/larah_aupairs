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
    
        
    public static final String HOST = "jdbc:mysql://localhost:3306/larah aupairs";
        
    public static final String USERNAME = "root";
    
    public static final String PASSWORD = "";

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
    
    public static final String AUPAIR_BACKGROUND = "images/background.png";
    
    /**
     * The version of the aupair form.
     */
    public static final double AUPAIR_VERSION = 1.0;
    
    /**
     * The version of the family form.
     */
    public static final double FAMILY_VERSION = 1.0;
    
    /**
     * Checks whether the application is in debug mode.
     */
    public static final boolean DEBUG_MODE = true;
    
    /**
     * All of our administrators within the system.
     */
    public static final String[] ADMINISTRATORS = {"12345"};
}

package larah.aupairs;

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
     * Checks whether for application is in debug mode.
     */
    public static boolean DEBUG_MODE = true;
    
    public static final int TIMER_AMOUNT = 15;
    

}

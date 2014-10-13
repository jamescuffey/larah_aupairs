package larah.aupairs.database.impl;

import larah.aupairs.Constants;
import larah.aupairs.database.Database;

/**
 *
 * @author James
 */
public class Aupair extends Database {
        
    public String name, surname, nationality, telephone, religion, profession, experience;
    
  

    @Override
    public void setupDatabase() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void writeToDatabase() {

    }

    @Override
    public double version() {
        return Constants.AUPAIR_VERSION;
    }
    
    
}

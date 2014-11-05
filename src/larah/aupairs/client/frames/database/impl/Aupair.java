package larah.aupairs.client.frames.database.impl;

import larah.aupairs.client.Constants;
import larah.aupairs.client.frames.database.Database;

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

    @Override
    public String connection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}

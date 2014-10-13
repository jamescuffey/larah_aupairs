/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package larah.aupairs.database.impl;

import larah.aupairs.Constants;
import larah.aupairs.database.Database;

/**
 *
 * @author James
 */
public class Family extends Database {

    @Override
    public void setupDatabase() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void writeToDatabase() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double version() {
        return Constants.FAMILY_VERSION;
    }
    
}

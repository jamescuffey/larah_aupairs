/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package larah.aupairs.client.frames.database.impl;

import larah.aupairs.client.Constants;
import larah.aupairs.client.frames.database.Database;

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

    @Override
    public String connection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

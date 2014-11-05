package larah.aupairs.client.frames.database;

/**
 *
 * @author James
 */
public abstract class Database {
    
    public abstract String connection();
    
    /**
     * Creates the database connection.
     */
    public abstract void setupDatabase();
    
    /**
     * Writes to the database.
     */
    public abstract void writeToDatabase();
    
    /**
     * The version of the form.
     * @return 
     */
    public abstract double version();
 
    
}

package larah.aupairs.client.task.impl;

import larah.aupairs.client.Utilities;
import larah.aupairs.client.task.Task;

/**
 *
 * @author James
 */
public class GarbageCollector extends Task {
    
    public GarbageCollector() {
        //how long the timer is
        super(120);
    }

    @Override
    protected void execute() {
        //check for finalizations
        System.runFinalization();
        
        //run the garbage collector
        System.gc();
        
        //show the alert   
        Utilities.setAlert(2);
    }
}

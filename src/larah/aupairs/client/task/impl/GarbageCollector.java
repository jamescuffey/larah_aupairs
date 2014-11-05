package larah.aupairs.client.task.impl;

import larah.aupairs.client.Constants;
import larah.aupairs.client.task.Task;
import org.nikkii.alertify4j.Alertify;
import org.nikkii.alertify4j.AlertifyBuilder;
import org.nikkii.alertify4j.AlertifyType;

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
        //check for finalizations.
        System.runFinalization();
        
        //run the garbage collector.
        System.gc();
        
        Alertify.show(new AlertifyBuilder().type(AlertifyType.LOG).icon(Constants.SPANNER_ACTION).text("System resources cleaned.").autoClose(5000).build());    
    }
}

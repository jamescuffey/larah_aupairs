package larah.aupairs;

import larah.aupairs.client.Constants;
import larah.aupairs.client.Main;
import larah.aupairs.client.Utilities;
import larah.aupairs.client.task.Task;
import larah.aupairs.client.task.TaskScheduler;
import larah.aupairs.client.task.impl.GarbageCollector;
import larah.aupairs.client.tools.developer.Logger;

/**
 *
 * @author James
 */
public class Engine {
    
    /**
     * Instance of main class.
     */
    private static Main engine; 
    
    /**
     * Initialises the task scheduler class instance.
     */
    public static TaskScheduler scheduler = new TaskScheduler();
    
    /**
     * Gets the task scheduler class instance.
     * @return scheduler
     */
    public static TaskScheduler getTaskScheduler() {
        return scheduler;
    } 

    /**
     * Our main entry point to the application.
     * @param args 
     */
     public static void main(String...args) { 
        engine = new Main();    
	Logger.log("Prompting " + Constants.APPLICATION_NAME + "...");        
        engine.run();        
        Logger.log(Constants.APPLICATION_NAME + " successfully running.");
        
        getTaskScheduler().schedule(new Task() {
	@Override
	protected void execute() { 
            Utilities.generateTime();
            
            if(Constants.DEBUG_MODE) {
                Main.getFramesPerSecond().display(); 
            } 
          }
        });  
        scheduler.schedule(new GarbageCollector());
    }

}

package larah.aupairs;

import java.util.Random;
import larah.aupairs.client.Constants;
import larah.aupairs.client.frames.Main;
import larah.aupairs.client.Utilities;
import larah.aupairs.client.frames.database.Database;
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
    private static Main main; 
    
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
         //initalise the main instance.
        main = new Main();  
        
        Logger.log("Prompting " + Constants.APPLICATION_NAME + "...");
        
        //run the main class.
        main.run();        
        Logger.log(Constants.APPLICATION_NAME + " successfully running...");
        
        //schedule new tasks called every ms.
        getTaskScheduler().schedule(new Task() {
            @Override
            protected void execute() { 
                Utilities.generateTime();
       
                if(Constants.DEBUG_MODE) {
                    Main.getFramesPerSecond().display(); 
                } 
            }
        });
  
        //schedule the new garbage collector.
        scheduler.schedule(new GarbageCollector());   
  
    }
}

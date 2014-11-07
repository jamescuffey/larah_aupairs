package larah.aupairs.client.frames.alert.impl;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import larah.aupairs.client.frames.alert.Alert;
import org.nikkii.alertify4j.Alertify;
import org.nikkii.alertify4j.AlertifyBuilder;
import org.nikkii.alertify4j.AlertifyType;

/**
 *
 * @author James
 */
public class CompleteAction extends Alert {

    @Override
    public void displayAlert() {
        Alertify.show(new AlertifyBuilder().type(type()).icon(action()).text(text()).autoClose(timer()).build()); 
    }

    @Override
    public Icon action() {
        return new ImageIcon(path());
    }

    @Override
    public String path() {
        return "images/success.png";
    }

    @Override
    public String text() {
        return "You have successfully completed an application.";
    }

    @Override
    public AlertifyType type() {
        return AlertifyType.SUCCESS;
    }

    @Override
    public int timer() {
        return 5000;
    }
    
}

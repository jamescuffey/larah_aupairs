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
public class PersonnelAlert extends Alert {

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
        return "images/spanner.png";
    }

    @Override
    public String text() {
        return "You are a non-administrative account, therefore, you cannot use this feature!";
    }

    @Override
    public AlertifyType type() {
        return AlertifyType.LOG;
    }

    @Override
    public int timer() {
        return 5000;
    }
    
}

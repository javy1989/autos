package ec.ricardo.com.ventaautos.util;

import android.app.AlertDialog;

import java.util.TimerTask;

/**
 * Created by Ricardo on 26/11/2017.
 */

public class CloseDialogTimeTask extends TimerTask {
    private AlertDialog ad;

    public CloseDialogTimeTask(AlertDialog ad) {
        this.ad = ad;
    }

    @Override
    public void run() {
            if (ad.isShowing()){
                ad.dismiss();
            }
    }
}

package sjsu.karthik.com.receivebroadcast;
import sjsu.karthik.com.receivebroadcast.MainActivity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Karthik on 03-01-2016.
 */
public class ReceiveCurrency extends BroadcastReceiver {
    public static String msg;

    @Override
    public void onReceive(Context context, Intent intent) {
        msg = intent.getStringExtra("message");
        Toast.makeText(context, "Intent Received :" , Toast.LENGTH_LONG).show();
    }
}


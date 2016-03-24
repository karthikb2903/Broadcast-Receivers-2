package sjsu.karthik.com.receivebroadcast;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    public void exitApp(View v){

        finish();
        System.exit(0);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        tv1 = (TextView) findViewById(R.id.textView);
        tv1.setText(ReceiveCurrency.msg);

    }

    @Override
    protected void onPause()
    {
        super.onPause();

        tv1 = (TextView) findViewById(R.id.textView);
        tv1.setText(ReceiveCurrency.msg);

    }

    @Override
    protected void onRestart()
    {
        super.onRestart();

        tv1 = (TextView) findViewById(R.id.textView);
        tv1.setText(ReceiveCurrency.msg);

    }
}

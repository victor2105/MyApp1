package br.com.victorhome.myapp.mainPanel;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;

import br.com.victorhome.myapp.R;

public class Main2Activity extends ActionBarActivity {


    Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        if(bundle.containsKey("LOGIN_VALUE")){
            String value = bundle.getString("LOGIN_VALUE");
        }

        Button sell = (Button) findViewById(R.id.menu_sell);
        sell.setOnClickListener(new GoToSellActivity(Main2Activity.this));

        Button administration = (Button) findViewById(R.id.menu_administration);
        administration.setOnClickListener(new GoToAdminActitvity(Main2Activity.this));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
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
}

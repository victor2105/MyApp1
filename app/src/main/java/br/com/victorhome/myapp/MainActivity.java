package br.com.victorhome.myapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import br.com.victorhome.myapp.login.Login;
import br.com.victorhome.myapp.login.LoginNewActivity;
import br.com.victorhome.myapp.login.LoginSimples;
import br.com.victorhome.myapp.login.LoginVerify;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText login_login = (EditText) findViewById(R.id.login_login);
        final EditText login_password = (EditText) findViewById(R.id.login_password);
        Button login_enter = (Button) findViewById(R.id.login_button);
        final Button login_clear = (Button) findViewById(R.id.login_clear);

        login_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strLogin = login_login.getText().toString();
                String strPass = login_password.getText().toString();

                Login makeLogin = new LoginNewActivity(new LoginSimples(new LoginVerify()));
                makeLogin.execute(MainActivity.this, strLogin, strPass);
            }
        });

        login_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login_login.setText("");
                login_password.setText("");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

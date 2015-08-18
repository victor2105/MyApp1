package br.com.victorhome.myapp.login;

import android.content.Context;
import android.content.*;

import br.com.victorhome.myapp.mainPanel.Main2Activity;

/**
 * Created by Victor on 8/16/2015.
 */
public class LoginNewActivity implements Login {

    Login login;

    public LoginNewActivity(Login login){
        this.login = login;
    }

    @Override
    public boolean execute(Context context, String strLogin, String strPass) {
        if(login.execute(context, strLogin, strPass)){
            Intent it = new Intent(context, Main2Activity.class);

            it.putExtra("LOGIN_VALUE", strLogin);

            context.startActivity(it);
        }
        return false;
    }
}

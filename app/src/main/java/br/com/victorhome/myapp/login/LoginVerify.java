package br.com.victorhome.myapp.login;

import android.content.Context;

/**
 * Created by Victor on 8/16/2015.
 */
public class LoginVerify implements Login {

    private String logincerto = "victor123";
    private String passcerto = "123456";


    @Override
    public boolean execute(Context context, String strLogin, String strPass) {
        return strLogin.endsWith(logincerto) && strPass.equals(passcerto);
    }
}

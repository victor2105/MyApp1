package br.com.victorhome.myapp.login;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Victor on 8/16/2015.
 */
public class LoginSimples implements Login{

    Login login;

    public LoginSimples(Login login){
        this.login = login;
    }

    @Override
    public boolean execute(Context context, String strLogin, String strPass) {
        if(login.execute(context, strLogin, strPass)){
            Toast.makeText(context, "Login com sucesso!", Toast.LENGTH_SHORT).show();
            return true;
        }else{
            Toast.makeText(context, "Erro! Login ou senha incorretos", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}

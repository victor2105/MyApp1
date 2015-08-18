package br.com.victorhome.myapp.login;

import android.content.Context;

/**
 * Created by Victor on 8/16/2015.
 */
public interface Login {
    boolean execute(Context context, String strLogin, String strPass);
}

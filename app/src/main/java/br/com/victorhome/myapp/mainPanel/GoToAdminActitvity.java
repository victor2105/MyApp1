package br.com.victorhome.myapp.mainPanel;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import br.com.victorhome.myapp.administration.AdminActivity;
import br.com.victorhome.myapp.sell.SellActivity;

/**
 * Created by Victor on 8/16/2015.
 */
public class GoToAdminActitvity implements View.OnClickListener {

    private Context context;
    public GoToAdminActitvity(Context context){
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(context, AdminActivity.class) ;
        context.startActivity(it);
    }
}

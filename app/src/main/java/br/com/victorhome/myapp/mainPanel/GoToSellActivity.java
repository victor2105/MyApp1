package br.com.victorhome.myapp.mainPanel;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import br.com.victorhome.myapp.sell.SellActivity;

/**
 * Created by Victor on 8/16/2015.
 */
public class GoToSellActivity implements View.OnClickListener {

    private Context context;
    public GoToSellActivity(Context context){
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(context, SellActivity.class) ;
        context.startActivity(it);
    }
}

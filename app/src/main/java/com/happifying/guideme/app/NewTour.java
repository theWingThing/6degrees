package com.happifying.guideme.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by nar on 7/14/14.
 */
public class NewTour extends ActionBarActivity {
    int layouts[] = {R.layout.new_where, R.layout.new_attractions}, i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layouts[i++]);
    }

    public void onClick(View view) {
        setContentView(layouts[i++]);
    }
}

package com.happifying.guideme.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nar on 7/7/14.
 */
public class TouristCurrent extends Fragment {
    public static final TouristCurrent newInstance() {
        TouristCurrent f = new TouristCurrent();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tourist_current, container, false);
        v.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), NewTour.class);
                startActivity(i);
            }
        });
        return v;
    }
}

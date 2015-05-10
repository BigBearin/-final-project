package com.example.br161.finalproject;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class RecyclerMain extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);

        getFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new RecyclerViewFragment())
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit();

    }
}



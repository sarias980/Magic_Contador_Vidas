package com.example.sergi.magic_contador_vidas;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ImageButton lifetwotoone;
    private ImageButton lifeometotwo;
    private Button p1posionmore;
    private Button p1posionless;
    private Button p2posionmore;
    private Button p2posionless;
    private ImageButton p1lifemore;
    private ImageButton p2lifemore;
    private ImageButton p1lifeless;
    private ImageButton p2lifeless;
    private TextView counter1;
    private TextView counter2;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        lifetwotoone = (ImageButton) view.findViewById(R.id.lifetwotoone);
        lifeometotwo = (ImageButton) view.findViewById(R.id.lifeometotwo);
        p1posionmore = (Button) view.findViewById(R.id.p1posionmore);
        p1posionless = (Button) view.findViewById(R.id.p1posionless);
        p2posionmore = (Button) view.findViewById(R.id.p2posionmore);
        p2posionless = (Button) view.findViewById(R.id.p2posionless);
        p1lifemore = (ImageButton) view.findViewById(R.id.p1lifemore);
        p2lifemore = (ImageButton) view.findViewById(R.id.p2lifemore);
        p1lifeless = (ImageButton) view.findViewById(R.id.p1lifeless);
        p2lifeless = (ImageButton) view.findViewById(R.id.p2lifeless);
        counter1 = (TextView) view.findViewById(R.id.counter1);
        counter2 = (TextView) view.findViewById(R.id.counter2);



        return view;
    }
}

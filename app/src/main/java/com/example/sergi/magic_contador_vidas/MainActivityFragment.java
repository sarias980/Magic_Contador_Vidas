package com.example.sergi.magic_contador_vidas;

import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    private int life1;
    private int life2;
    private int poison1;
    private int poison2;
    private View view;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);

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

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.lifeometotwo:
                        life1--;
                        life2++;
                        break;
                    case R.id.lifetwotoone:
                        life1++;
                        life2--;
                        break;
                    case R.id.p1posionmore:
                        poison1++;
                        break;
                    case R.id.p2posionmore:
                        poison2++;
                        break;
                    case R.id.p1posionless:
                        poison1--;
                        break;
                    case R.id.p2posionless:
                        poison2--;
                        break;
                    case R.id.p1lifemore:
                        life1++;
                        break;
                    case R.id.p1lifeless:
                        life1--;
                        break;
                    case R.id.p2lifemore:
                        life2++;
                        break;
                    case R.id.p2lifeless:
                        life2--;
                        break;
                }
                updateViews();
            }
        };

        reset();

        lifetwotoone.setOnClickListener(listener);
        lifeometotwo.setOnClickListener(listener);
        p1posionmore.setOnClickListener(listener);
        p1posionless.setOnClickListener(listener);
        p2posionmore.setOnClickListener(listener);
        p2posionless.setOnClickListener(listener);
        p1lifemore.setOnClickListener(listener);
        p2lifemore.setOnClickListener(listener);
        p1lifeless.setOnClickListener(listener);
        p2lifeless.setOnClickListener(listener);
        counter1.setOnClickListener(listener);
        counter2.setOnClickListener(listener);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        inflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.reset){
            reset();
            Snackbar.make(view, "New Game", Snackbar.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
    }

    private void reset() {
        life1 = 20;
        life2 = 20;
        poison1 = 0;
        poison2 = 0;

        updateViews();
    }

    private void updateViews() {
        counter1.setText(String.format("%d/%d", life1, poison1));
        counter2.setText(String.format("%d/%d", life2, poison2));
    }
}

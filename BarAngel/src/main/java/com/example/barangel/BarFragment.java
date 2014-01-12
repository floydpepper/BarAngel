package com.example.barangel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mlynch on 12/01/14.
 */
public class BarFragment extends Fragment {

    public BarFragment()
    {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView;
        rootView = inflater.inflate(R.layout.fragment_main_bar, container, false);
        TextView bartxtView = (TextView) rootView.findViewById(R.id.section_label);
        bartxtView.setText("Choose bar");
        return rootView;
    }
}

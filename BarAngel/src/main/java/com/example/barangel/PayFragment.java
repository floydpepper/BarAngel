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
public class PayFragment extends Fragment {

    public PayFragment()
    {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_main_pay, container, false);
        TextView beertxtView = (TextView) rootView.findViewById(R.id.section_label);
        beertxtView.setText("You Drank X and you owe Y");
        return rootView;
    }
}

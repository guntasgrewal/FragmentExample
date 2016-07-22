package com.example.guntasgrewal.fragmentexample;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by guntasgrewal on 7/20/16.
 */
public class DemoFragment extends Fragment implements View.OnClickListener{

    Button clickMeButton;
    int counter = 0;
    Communicator comm;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_demo_layout, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm = (Communicator) getActivity();
        clickMeButton = (Button) getActivity().findViewById(R.id.clickMeButton);
        clickMeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        counter++;
        comm.respond("The button was clicked " + counter + " times");
    }
}

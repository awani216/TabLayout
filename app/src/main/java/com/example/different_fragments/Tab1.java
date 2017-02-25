package com.example.different_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Awani on 1/11/2017.
 */
public class Tab1 extends Fragment {
    // Store instance variables
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static Tab1 newInstance(int page) {
        Tab1 fragmentFirst = new Tab1();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        //args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        //title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.tv_tab1);
        tvLabel.setText(page + " -- " + title);
        return view;
    }
}

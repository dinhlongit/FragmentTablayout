package com.englishit.fragmenttablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Page_3  extends Fragment {

    //Constructor default
    public Page_3(){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageThree = inflater.inflate(R.layout.page3, container, false);
        return PageThree;
    }
}
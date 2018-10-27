package com.englishit.fragmenttablayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by haade on 13/09/2017.
 */

public class Page_1 extends Fragment {
     Button btnLink;

    //Constructor default
    public Page_1(){};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageOne = inflater.inflate(R.layout.page1, container, false);
        btnLink = (Button) PageOne.findViewById(R.id.btnLink);
        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(getActivity(),Page_2.class);
            }
        });

        return PageOne;

    }


}
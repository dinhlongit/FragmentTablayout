package com.englishit.fragmenttablayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    TabLayout MyTabs;
    ViewPager MyPage;
   Button btnLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MyTabs = (TabLayout)findViewById(R.id.MyTabs);
        MyPage = (ViewPager)findViewById(R.id.MyPage);
        btnLink = (Button) findViewById(R.id.btnLink);

       MyTabs.setupWithViewPager(MyPage);
       SetUpViewPager(MyPage);



    }


    public void SetUpViewPager (ViewPager viewpage){
        MyViewPageAdapter Adapter = new MyViewPageAdapter(getSupportFragmentManager());

        Adapter.AddFragmentPage(new Page_1(), "Tab 1");
        Adapter.AddFragmentPage(new Page_2(), "Tab 2");
        Adapter.AddFragmentPage(new Page_3(), "Tab 3");
        viewpage.setAdapter(Adapter);
    }



}
package com.etilk.travel.whereto;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.etilk.travel.whereto.Fragments.DisplaysFragment;
import com.etilk.travel.whereto.Fragments.ProfileFragment;
import com.etilk.travel.whereto.Fragments.RecomendationsFragment;

public class MainActivity extends AppCompatActivity implements DisplaysFragment.OnFragmentInteractionListener, ProfileFragment.OnFragmentInteractionListener, RecomendationsFragment.OnFragmentInteractionListener {

    ViewPager mainViewPager;

    private void initViews() {
        mainViewPager = findViewById(R.id.mainViewPager);
    }

    private void initListeners() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initListeners();

        setUpViewPager(mainViewPager);
    }

    public void setUpViewPager (ViewPager viewPager) {
        MainPageAdapter mainPageAdapter = new MainPageAdapter(getSupportFragmentManager());


        mainPageAdapter.AddFragmentPage(new ProfileFragment());
        mainPageAdapter.AddFragmentPage(new DisplaysFragment());
        mainPageAdapter.AddFragmentPage(new DisplaysFragment());


        viewPager.setAdapter(mainPageAdapter);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

package com.example.sp20_bse_008_assi_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private FragmentManager manage;
    private FragmentTransaction trans;
    private fragmentleftbox leftbox;
    private fragmentrightbox rightbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            manage = getSupportFragmentManager();
            trans = manage.beginTransaction();
            leftbox = fragmentleftbox.newInstance();
            rightbox = fragmentrightbox.newInstance();
            trans.replace(R.id.leftbox, leftbox);
            trans.replace(R.id.rightbox, rightbox);
            trans.commit();
        }
    }
}
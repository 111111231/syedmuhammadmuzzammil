package com.smm.muzzammil.makeuseful.GridView;
/**
 * Created by Syed Muhammad Muzzammil on 10/18/16.
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import com.smm.muzzammil.makeuseful.R;
import com.smm.muzzammil.makeuseful.WebView.WebViewActivity;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {


    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayoutAndroid;
    CoordinatorLayout rootLayoutAndroid;
    GridView gridView;
    Context context;
    ArrayList arrayList;
    public static String url = "http://www.google.com";

    public static String[] gridViewStrings = {
            "Kel",
            "Keran",
            "Sharda",
            "SaifUlMalook",
            "Shogran",
            "Hunza",
            "Diamer",
            "Kalam",
            "Miandam",
    };
    public static int[] gridViewImages = {
            R.drawable.kel,
            R.drawable.keran,
            R.drawable.sharda,
            R.drawable.saifulmalook,
            R.drawable.shogran,
            R.drawable.hunza,
            R.drawable.diamer,
            R.drawable.kalam,
            R.drawable.miandam,
    };

    public static String[] gridViewUrls = {
            "https://en.wikipedia.org/wiki/Kel,_Azad_Kashmir",
            "https://en.wikipedia.org/wiki/Keran,_Azad_Kashmir",
            "https://en.wikipedia.org/wiki/Sharda,_Azad_Kashmir",
            "https://en.wikipedia.org/wiki/Lake_Saiful_Muluk",
            "https://en.wikipedia.org/wiki/Shogran",
            "https://en.wikipedia.org/wiki/Hunza_Valley",
            "https://en.wikipedia.org/wiki/Diamer_District",
            "https://en.wikipedia.org/wiki/Kalam,_Swat",
            "https://en.wikipedia.org/wiki/Miandam,_Swat",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view_main_layout);
        context = this;
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        gridView = (GridView) findViewById(R.id.grid);
        gridView.setAdapter(new GridViewAdapter(this, gridViewStrings, gridViewImages));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        url = gridViewUrls[i];
                        startActivity(new Intent((Activity)context, WebViewActivity.class));
                    }
                });
            }
        });

        initInstances();
    }

    private void initInstances() {
        rootLayoutAndroid = (CoordinatorLayout) findViewById(R.id.android_coordinator_layout);
        collapsingToolbarLayoutAndroid = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_android_layout);
        collapsingToolbarLayoutAndroid.setTitle("Grid View Sample");
    }
}
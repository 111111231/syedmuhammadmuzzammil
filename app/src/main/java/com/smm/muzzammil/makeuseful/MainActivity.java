package com.smm.muzzammil.makeuseful;
/**
 * Created by Syed Muhammad Muzzammil on 10/18/16.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.smm.muzzammil.makeuseful.GridView.GridViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, GridViewActivity.class));
    }
}

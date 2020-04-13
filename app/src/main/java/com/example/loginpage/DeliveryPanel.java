package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class DeliveryPanel extends AppCompatActivity {

    DrawerLayout drawerlayout;
    NavigationView navigationview;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_panel);

        drawerlayout = findViewById(R.id.drawer_layout);
        navigationview = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.tool)
    }
}

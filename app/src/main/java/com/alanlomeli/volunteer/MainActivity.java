package com.alanlomeli.volunteer;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.alanlomeli.volunteer.Fragments.CuentaFragment;
import com.alanlomeli.volunteer.Fragments.EventoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    public BottomNavigationView btnNavView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = getIntent();
        init();
        cambiarFragment(EventoFragment.newinstance());
        btnNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId())
                {
                    case R.id.m_cuenta:
                        cambiarFragment(CuentaFragment.newinstance());
                        return true;

                    case R.id.m_evento:
                        cambiarFragment(EventoFragment.newinstance());
                        return  true;
                }
                return false;
            }
        });
    }
    public void init(){
        this.btnNavView = findViewById(R.id.bn_view);
    }
    private void cambiarFragment(Fragment fragment){
        FragmentTransaction  transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame, fragment);
        transaction.commit();
    }
}

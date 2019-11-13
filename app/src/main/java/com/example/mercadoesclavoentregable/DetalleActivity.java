package com.example.mercadoesclavoentregable;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class DetalleActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private DetalleFragment detalleFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);


        this.fragmentManager = getSupportFragmentManager();
        this.detalleFragment = new DetalleFragment();


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        detalleFragment.setArguments(bundle);


        FragmentTransaction fragmentTransaction = this.fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.activityDetalleContenedorFragment,detalleFragment).commit();


    }
}

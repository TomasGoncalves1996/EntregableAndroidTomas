package com.example.mercadoesclavoentregable;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements ListaFragment.ListaFragmentListener {

    private FragmentManager fragmentManager;
    private ListaFragment listaFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.fragmentManager = getSupportFragmentManager();
        this.listaFragment = new ListaFragment();

        FragmentTransaction fragmentTransaction = this.fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.activityMainContenedorDeFragment,listaFragment).commit();

}

    public void informarSeleccionDesdeListaFragment(Producto producto) {

        //7 Creo el intent
        Intent intent = new Intent(this, DetalleActivity.class);
        //creo el bundle
        Bundle bundle = new Bundle();
        //le doy el chat al bundle
        bundle.putSerializable(DetalleFragment.KEY_PRODUCTO,producto);
        //asociamos el bundle al intent
        intent.putExtras(bundle);
        //iniciamos la actividad
        startActivity(intent);
        Toast.makeText(this, "Tocaron a "+producto.getNombre(), Toast.LENGTH_SHORT).show();
}}

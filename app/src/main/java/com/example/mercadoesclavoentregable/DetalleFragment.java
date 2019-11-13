package com.example.mercadoesclavoentregable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DetalleFragment extends Fragment {


    public static final String KEY_PRODUCTO = "producto";


    public DetalleFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detalle, container, false);

        ImageView imageView = view.findViewById(R.id.fragmentDetalleImageView);
        TextView textViewNombre = view.findViewById(R.id.fragmentDetalleTextViewNombre);

        Bundle bundle = getArguments();

        Producto producto = (Producto) bundle.getSerializable(KEY_PRODUCTO);

        imageView.setImageResource(producto.getImagen());
        textViewNombre.setText(producto.getNombre());

        return view;
    }

}

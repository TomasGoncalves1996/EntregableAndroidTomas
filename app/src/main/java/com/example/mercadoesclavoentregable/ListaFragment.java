package com.example.mercadoesclavoentregable;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class ListaFragment extends Fragment implements ProductoAdapter.ChatAdapterListener {

    private RecyclerView recyclerView;
    private ListaFragmentListener listaFragmentListener;

    public ListaFragment() {
        this.recyclerView = recyclerView;
        this.listaFragmentListener = listaFragmentListener;
    }

    @Override
    public void informarSeleccion(Producto producto) {

    }

    public interface ListaFragmentListener {
    }
}
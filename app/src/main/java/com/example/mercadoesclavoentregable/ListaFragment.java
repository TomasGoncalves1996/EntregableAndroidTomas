package com.example.mercadoesclavoentregable;

import androidx.fragment.app.Fragment;

public class ListaFragment extends Fragment implements ProductoAdapter.ChatAdapterListener {

    private RecyclerView recyclerView;
    private ListaFragmentListener listaFragmentListener;
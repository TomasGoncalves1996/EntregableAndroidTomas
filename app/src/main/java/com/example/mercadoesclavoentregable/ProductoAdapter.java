package com.example.mercadoesclavoentregable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductoAdapter extends RecyclerView.Adapter {

    private List<Producto> productoList;
    private ProductoAdapterListener listener;

    public ProductoAdapter(List<Producto> productoList, ProductoAdapterListener productoAdapterListener ) {
        this.productoList = productoList;
        this.listener = productoAdapterListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflar el xml (pasar xml a View)
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.celda_producto, parent, false);
        ProductoViewHolder productoViewHolder = new ProductoViewHolder(view);
        return productoViewHolder;

    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ProductoViewHolder productoViewHolder = (ProductoViewHolder) holder;
        Producto producto = this.productoList.get(position);
        productoViewHolder.bind(producto);
    }


    @Override
    public int getItemCount() {
        return this.productoList.size();
    }

    private class ProductoViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageViewCeldaImagen;
        private TextView textViewCeldaNombre;
        private TextView textViewceldaPrecio;
        private Producto producto;

        /**
         * Constructor
         * hacemos los findViewById de los elemtnos del ItemVIew Inflado Previamente
         * @param itemView
         */
        public ProductoViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageViewCeldaImagen = itemView.findViewById(R.id.imageViewCeldaImagen);
            this.textViewCeldaNombre = itemView.findViewById(R.id.textViewCeldaNombre);
            this.textViewceldaPrecio = itemView.findViewById(R.id.textViewceldaPrecio);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int adapterPosition = getAdapterPosition();
                    Producto producto  = productoList.get(adapterPosition);
                    // 5 si hacen click en un chat le informamos al fragment
                    listener.informarSeleccion(producto);

                }
            });
        }

        public void bind(Producto unProducto){
            // this.chat = chat;
            this.imageViewCeldaImagen.setImageResource(unProducto.getImagen());
            this.textViewCeldaNombre.setText(unProducto.getNombre());
            this.textViewceldaPrecio.setText(unProducto.getPrecio());
        }
    }



    public interface ChatAdapterListener{
        public void informarSeleccion(Producto producto);

    }


}

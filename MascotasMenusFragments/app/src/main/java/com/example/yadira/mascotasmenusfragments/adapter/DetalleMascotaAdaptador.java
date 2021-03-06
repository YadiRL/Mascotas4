package com.example.yadira.mascotasmenusfragments.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yadira.mascotasmenusfragments.R;
import com.example.yadira.mascotasmenusfragments.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by fcarvajal on 20/02/2017.
 */

public class DetalleMascotaAdaptador extends RecyclerView.Adapter<DetalleMascotaAdaptador.DetalleMascotaViewHolder>{

    private ArrayList<Mascota> ListaMascotas;
    private Activity activity;

    public DetalleMascotaAdaptador(ArrayList<Mascota> ListaMascotas, Activity activity) {
        this.ListaMascotas = ListaMascotas;
        this.activity = activity;
    }

    //Va a inflar el layout y lo pasara al ViewHolder para que
    //el obtenga cada elemento de los views

    @Override
    public DetalleMascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_detalle, parent, false);

        return new DetalleMascotaViewHolder(v);
    }


    //asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(final DetalleMascotaViewHolder holder, int position) {
        final Mascota mascota = ListaMascotas.get(position);

        holder.cardview_detalle_imgMascota.setImageResource(mascota.getFoto());
        holder.cardview_detalle_tvRaiting.setText(mascota.getRaiting_string());
    }

    @Override
    public int getItemCount() {//cantidad de elementos que contiene la lista de mascotas
        return ListaMascotas.size();
    }

    public static class DetalleMascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView cardview_detalle_imgMascota;
        private TextView cardview_detalle_tvRaiting;

        public DetalleMascotaViewHolder(View itemView) {
            super(itemView);

            cardview_detalle_imgMascota = (ImageView) itemView.findViewById(R.id.cardview_detalle_imgMascota);
            cardview_detalle_tvRaiting = (TextView) itemView.findViewById(R.id.cardview_detalle_tvRaiting);
            //cardview_detalle_imgHuesoAmarillo = (ImageView) itemView.findViewById(R.id.cardview_detalle_imgHuesoAmarillo);
        }
    }


}

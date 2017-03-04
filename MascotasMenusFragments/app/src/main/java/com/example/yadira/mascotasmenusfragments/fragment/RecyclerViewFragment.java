package com.example.yadira.mascotasmenusfragments.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yadira.mascotasmenusfragments.R;
import com.example.yadira.mascotasmenusfragments.adapter.MascotaAdaptador;
import com.example.yadira.mascotasmenusfragments.pojo.Mascota;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {

    private ArrayList<Mascota> ListaMascotas;
    private RecyclerView RVListaMascotas;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }

    public void setListaMascotas(ArrayList<Mascota> ListaMascotas){
        this.ListaMascotas = ListaMascotas;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        setRecyclerView_listaVertical(v);

        return v;
    }

    public void setRecyclerView_listaVertical(View v){
        RVListaMascotas = (RecyclerView) v.findViewById(R.id.recycler_view_mascotas_main_activity);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        RVListaMascotas.setLayoutManager(llm);
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(ListaMascotas, getActivity());
        RVListaMascotas.setAdapter(adaptador);
    }

}

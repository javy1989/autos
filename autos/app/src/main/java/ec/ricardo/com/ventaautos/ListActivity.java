package ec.ricardo.com.ventaautos;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import ec.ricardo.com.ventaautos.model.Vehiculo;
import ec.ricardo.com.ventaautos.util.Adaptador;

public class ListActivity extends Fragment {

    private List<Vehiculo> vehiculos;
    private Button btnAgregar;
    private ListView vehiculosView;
    private Adaptador mAdaptador;
    private Vehiculo vehiculo;
    private boolean lunch= false;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.activity_list,container,false);
        btnAgregar=(Button) v.findViewById(R.id.btnNuevo);
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddActivity add=new AddActivity();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                vehiculo=new Vehiculo();
                fragmentTransaction.replace(R.id.frameLayout,add);
                fragmentTransaction.commit();
            }
        });
        vehiculosView=(ListView)v.findViewById(R.id.listViewVehiculos);
        vehiculos=new ArrayList<>();
        vehiculos.add(new Vehiculo(R.drawable.car,1,"PFD","Mazda","Rojo", Calendar.getInstance().getTime(),true));
        vehiculos.add(new Vehiculo(R.drawable.car,2,"PFD","Mazda","Rojo", Calendar.getInstance().getTime(),true));
        vehiculos.add(new Vehiculo(R.drawable.car,3,"PFD","Mazda","Rojo", Calendar.getInstance().getTime(),true));
        mAdaptador=new Adaptador(getActivity().getApplicationContext(),vehiculos);
        vehiculosView.setAdapter(mAdaptador);
        return v;
    }

    public void addVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
        mAdaptador.notifyDataSetChanged();
    }
}

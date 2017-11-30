package ec.ricardo.com.ventaautos.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import ec.ricardo.com.ventaautos.R;
import ec.ricardo.com.ventaautos.model.Vehiculo;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by Ricardo on 29/11/2017.
 */

public class Adaptador extends BaseAdapter {

    private Context context;
    private List<Vehiculo> vehiculos;

    public Adaptador(Context context, List<Vehiculo> vehiculos) {
        this.context = context;
        this.vehiculos = vehiculos;
    }

    @Override
    public int getCount() {
        return vehiculos.size();
    }

    @Override
    public Object getItem(int position) {
        return vehiculos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return vehiculos.get(position).getIdentificador();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.row,null);
        Vehiculo item=(Vehiculo)getItem(position);

        ImageView rowImg=(ImageView) convertView.findViewById(R.id.rowImagen);
        TextView rowPlaca=convertView.findViewById(R.id.rowPlaca);
        TextView rowMarca=convertView.findViewById(R.id.rowMarca);
        TextView rowColor=convertView.findViewById(R.id.rowColor);
        EditText rowFecha=(EditText)convertView.findViewById(R.id.rowFecha);
        CheckBox rowEstado=(CheckBox)convertView.findViewById(R.id.rowEstado);

        rowImg.setImageResource(item.getImg());
        rowPlaca.setText(item.getPlaca());
        rowMarca.setText(item.getMarca());
        rowColor.setText(item.getColor());
        SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd");
        rowFecha.setText(formato.format(item.getFecha()));
        rowEstado.setChecked(item.getEstado());
        return convertView;
    }
}

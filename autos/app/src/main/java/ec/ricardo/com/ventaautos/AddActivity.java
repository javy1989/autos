package ec.ricardo.com.ventaautos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Calendar;

import ec.ricardo.com.ventaautos.model.Vehiculo;

public class AddActivity extends Fragment {

    private Vehiculo vehiculo;
    private Button btnAnadir;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_add, container, false);
        return v;
    }

}

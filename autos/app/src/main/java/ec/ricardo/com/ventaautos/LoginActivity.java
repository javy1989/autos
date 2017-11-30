package ec.ricardo.com.ventaautos;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import ec.ricardo.com.ventaautos.model.Usuario;
import ec.ricardo.com.ventaautos.util.CloseDialogTimeTask;

public class LoginActivity extends AppCompatActivity {


    private EditText user;
    private EditText pwd;
    private Button button;
    private List<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initUser();
    }

    private void initUser() {
        Log.i("Creando usuarios", "s");
        Usuario usr = new Usuario("andres", "andres");
        Usuario usr1 = new Usuario("angelica", "angelica");
        Usuario usr2 = new Usuario("ricardo", "ricardo");
        usuarios = new ArrayList<>();
        usuarios.add(usr);
        usuarios.add(usr1);
        usuarios.add(usr2);
    }

    public void onClickLogin(View v) {
        user = (EditText) findViewById(R.id.editTextUser);
        pwd = (EditText) findViewById(R.id.editTextPwd);
        Log.i("Iso click", "Buscando");
        if (!buscarUsuarioinListFinfByUserandPwd()) {
            AlertDialog.Builder a_builder = new AlertDialog.Builder(LoginActivity.this);
            a_builder.setMessage("Usuario o Contrasenia incorrectos")
                    .setCancelable(false);
            AlertDialog alert = a_builder.create();
            alert.setTitle("Informacion");
            alert.show();
            pwd.setText("");
            Timer t = new Timer();
            t.schedule(new CloseDialogTimeTask(alert), 5000);
        }else{
            Intent home=new Intent(this,HomeActivity.class);
            startActivity(home);
        }
    }


    private boolean buscarUsuarioinListFinfByUserandPwd() {
        for (Usuario u : usuarios) {
            if (u.getUser().compareTo(user.getText().toString()) == 0 && u.getPwd().compareTo(pwd.getText().toString()) == 0) {
                return true;
            }
        }
        return false;
    }
}

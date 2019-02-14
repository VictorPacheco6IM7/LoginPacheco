package victorpacheco.cecyt9.mx.ipn.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnIngresar;
    EditText usu,psw;
    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usu = findViewById(R.id.User);
        psw = findViewById(R.id.Contra);
        btnIngresar = findViewById(R.id.Login);
        msg = findViewById(R.id.msg);

    }

    @Override
    public void onClick(View v) {

        if(usu.getText().toString().equals("Victor")){
            if(psw.getText().toString().equals("1234")){
                Toast.makeText(this, "Sesion Iniciada", Toast.LENGTH_LONG).show();
                Guardar(v);
            }else
                msg.setText("Usuario y/o contraseña erroneos");
        }else
            msg.setText("Usuario y/o contraseña erroneos");
    }

    public void Guardar(View v){

        Intent envia = new Intent(this, Main2Activity.class);
        Bundle datos = new Bundle();

        datos.putString("Usuario", usu.getText().toString());
        envia.putExtras(datos);
        finish();
        startActivity(envia);
    }
}

package ulacit.ed.appcomponentes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_aceptar;
    private TextView resultado, txt_nombre, txt_telefono;
    private EditText valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Cargamos el texto enviado a la vista 2
        valor = (EditText)findViewById(R.id.txt_nombre);

//        Objetos de la vista
        btn_aceptar = (Button)findViewById(R.id.btn_aceptar);
        resultado = (TextView)findViewById(R.id.lbl_resultado);
        txt_nombre = (TextView)findViewById(R.id.txt_nombre);
        txt_telefono = (TextView)findViewById(R.id.txt_telefono);

        btn_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                resultado.setText("Bienvenido " + txt_nombre.getText() + " Telefono: " + txt_telefono.getText());
                Intent intent = new Intent(v.getContext(), RegistroActivity.class);

//                Enviar parametro de la vista 1
                intent.putExtra("nombre", txt_nombre.getText().toString());
                startActivity(intent);
            }
        });

    }
}

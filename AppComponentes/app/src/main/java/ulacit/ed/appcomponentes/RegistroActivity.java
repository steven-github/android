package ulacit.ed.appcomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

//        Muestra el parametro de la vista anterior
        Bundle bundle = getIntent().getExtras();
        String valorDevuelto = bundle.getString("nombre");

        EditText salida = (EditText)findViewById(R.id.edit_name);
        salida.setText(valorDevuelto);
    }
}

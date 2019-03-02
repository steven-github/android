package ulacit.ed.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoContraintLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_contraint_layout);

        //        Muestra el parametro de la vista anterior
        Bundle bundle = getIntent().getExtras();
        String valorDevuelto = bundle.getString("txt_total_calc");

        TextView txt_resultado = (TextView)findViewById(R.id.txt_resultado);
        txt_resultado.setText(valorDevuelto);
    }
}

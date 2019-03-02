package ulacit.ed.linearlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LinearLayout extends AppCompatActivity {

    private Button btn_confirmar, btn_volver;
    private TextView txt_producto1, txt_producto2, txt_producto3, txt_total_calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        btn_confirmar = (Button)findViewById(R.id.btn_confirmar);
        btn_volver = (Button)findViewById(R.id.btn_volver);

        txt_producto1 = (TextView)findViewById(R.id.txt_producto1);
        txt_producto2 = (TextView)findViewById(R.id.txt_producto2);
        txt_producto3 = (TextView)findViewById(R.id.txt_producto3);
        txt_total_calc = (TextView)findViewById(R.id.txt_total_calc);

        btn_confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ResultadoContraintLayout.class);

                int total = Integer.parseInt(txt_producto1.getText().toString()) + Integer.parseInt(txt_producto2.getText().toString());

                txt_total_calc.setText(Integer.toString(total) + ".00 €");

//                Enviar parametro de la vista
                intent.putExtra("txt_total_calc", txt_total_calc.getText().toString());
                startActivity(intent);
            }
        });

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

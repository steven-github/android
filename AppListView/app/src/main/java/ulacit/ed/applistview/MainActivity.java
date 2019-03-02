package ulacit.ed.applistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listacontacto;
    private ArrayList<contacto> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listacontacto = (ListView)findViewById(R.id.lv_listarContactos);
        lista = new ArrayList<contacto>();

        lista.add(new contacto(1, R.drawable.contact_img, "Steven", "Developer", "Logistic Studios"));
        lista.add(new contacto(2, R.drawable.contact_img, "Ana", "Administradora", "Ulacit"));
        lista.add(new contacto(3, R.drawable.contact_img, "Juan", "Arquitecto", "Intel"));
        lista.add(new contacto(4, R.drawable.contact_img, "Pedro", "Developer", "Gorilla Logic"));
        lista.add(new contacto(5, R.drawable.contact_img, "Maria", "Administradora", "SoftTec"));
        lista.add(new contacto(6, R.drawable.contact_img, "Rolando", "Developer", "Growth Acceleration Partners"));
        lista.add(new contacto(7, R.drawable.contact_img, "Jose", "Arquitecto", "Logistic Studios"));
        lista.add(new contacto(8, R.drawable.contact_img, "Alberto", "Developer", "Logistic Studios"));
        lista.add(new contacto(9, R.drawable.contact_img, "Mauricio", "Arquitecto", "Logistic Studios"));
        lista.add(new contacto(10, R.drawable.contact_img, "Kevin", "Developer", "Logistic Studios"));
        lista.add(new contacto(11, R.drawable.contact_img, "Maria", "Administradora", "Logistic Studios"));
        lista.add(new contacto(12, R.drawable.contact_img, "Ericka", "Administradora", "Logistic Studios"));
        lista.add(new contacto(13, R.drawable.contact_img, "Sofia", "Administradora", "Logistic Studios"));
        lista.add(new contacto(14, R.drawable.contact_img, "Felipe", "Developer", "Logistic Studios"));
        lista.add(new contacto(15, R.drawable.contact_img, "Pedro", "Arquitecto", "Logistic Studios"));

        Adaptador miAdaptardor = new Adaptador(getApplicationContext(), lista);
        listacontacto.setAdapter(miAdaptardor);

        listacontacto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                contacto valor = lista.get(position);
                Toast.makeText(MainActivity.this, "Item Seleccionado: " + valor.getNombre(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}

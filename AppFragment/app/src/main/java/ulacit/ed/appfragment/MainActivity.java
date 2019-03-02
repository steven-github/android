package ulacit.ed.appfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner provincias, cantones;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        provincias = (Spinner) findViewById(R.id.spinner_provincias);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.provincias, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        provincias.setAdapter(adapter);



//        provincias = (Spinner) findViewById(R.id.spinner_provincias);

        provincias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String provincia = provincias.getSelectedItem().toString();
                cantones = (Spinner) findViewById(R.id.spinner_cantones);
                ArrayAdapter<CharSequence> adapter = new ArrayAdapter(getApplicationContext(),
                        R.layout.support_simple_spinner_dropdown_item, listarCantones(position));
                cantones.setAdapter(adapter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        list = (ListView)findViewById(R.id.lista_contactos);
        final String[] contactos = {"Joanquin", "Pedro", "Carlos", "Jose"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1
                , contactos);
        list.setAdapter(adapter1);


    }

    public ArrayList<String> listarCantones(int provincia) {

        ArrayList<String> listaCanton = new ArrayList<>();

        if (provincia == 0) {
            listaCanton.add("San José Central");
            listaCanton.add("Escazú");
            listaCanton.add("Desamparados");
            listaCanton.add("Puriscal");
            listaCanton.add("Tarrazú");
        } else if (provincia == 1) {
            listaCanton.add("Aserrí");
            listaCanton.add("Mora");
            listaCanton.add("Goicoechea");
            listaCanton.add("Santa Ana");
            listaCanton.add("Alajuelita");
            listaCanton.add("Coronado");
        } else if (provincia == 2) {
            listaCanton.add("Acosta");
            listaCanton.add("Tibás");
            listaCanton.add("Moravia");
            listaCanton.add("Montes de Oca");
            listaCanton.add("Turrubares");
            listaCanton.add("Dota");
            listaCanton.add("Curridabat");
        }

        return listaCanton;

    }
}

package ulacit.ed.appcomponentes2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;

public class ToolBarActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private CheckBox ch_tv, ch_internet;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);

//        Cargando spinner con lista de paises
        spinner = (Spinner)findViewById(R.id.sp_spinner);
        String[] paises = {"Costa Rica", "Panama"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner, paises);


//        toolbar = (Toolbar)findViewById(R.id.tool_bar);
//        setSupportActionBar(toolbar);

        ch_tv = (CheckBox)findViewById(R.id.ch_tv);

        ch_tv.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
               Toast msj = Toast.makeText(getApplicationContext(), "Te gusta la TV", Toast.LENGTH_SHORT);
               msj.setGravity(Gravity.CENTER, 0,0);
               msj.show();
           }
        });
    }

    private void itemSeleccionado() {
        ch_tv = (CheckBox)findViewById(R.id.ch_tv);
        ch_internet = (CheckBox)findViewById(R.id.ch_internet);

        if (ch_tv.isChecked()) {
            Toast msj = Toast.makeText(this, "Te gusta la TV", Toast.LENGTH_SHORT);
            msj.setGravity(Gravity.CENTER, 0,0);
            msj.show();
        }
    }
}

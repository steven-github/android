package ulacit.ed.apptester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(this, "onCreate!", duration).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(this, "onStart!", duration).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(this, "onResume!", duration).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(this, "onPause!", duration).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(this, "onStop!", duration).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(this, "onDestroy!", duration).show();
    }
}

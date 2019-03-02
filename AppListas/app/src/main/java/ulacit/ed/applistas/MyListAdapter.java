package ulacit.ed.applistas;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] nombre;
    private final String[] cargo;
    private final String[] compania;
    private final Integer[] imgid;

    public MyListAdapter(Activity context, String[] nombre, String[] cargo, String[] compania, Integer[] imgid) {
        super(context, R.layout.activity_my_list_adapter, nombre);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.nombre=maintitle;
        this.cargo=subtitle;
        this.compania=compania;
        this.imgid=imgid;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_my_list_adapter, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);

        titleText.setText(nombre[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(cargo[position]);

        return rowView;

    };
}

package ulacit.ed.applistview;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {

    Context contexto;
    List<contacto> listaContactos;

    public Adaptador(Context contexto, List<contacto> listaContactos) {
        this.contexto = contexto;
        this.listaContactos = listaContactos;
    }

    @Override
    public int getCount() {
        return listaContactos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaContactos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaContactos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater i = LayoutInflater.from(contexto);
        v = i.inflate(R.layout.itemlistview, null);

        ImageView imagen = (ImageView)v.findViewById(R.id.img_contacto);
        TextView nombre = (TextView)v.findViewById(R.id.tv_nombre);
        TextView cargo = (TextView)v.findViewById(R.id.tv_cargo);
        TextView compania = (TextView)v.findViewById(R.id.tv_compania);

        imagen.setImageResource(listaContactos.get(position).getImage());
        nombre.setText(listaContactos.get(position).getNombre());
        cargo.setText(listaContactos.get(position).getCargo());
        compania.setText(listaContactos.get(position).getCompania());

        return v;
    }
}

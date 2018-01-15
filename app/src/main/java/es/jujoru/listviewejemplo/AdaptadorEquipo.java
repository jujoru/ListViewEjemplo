package es.jujoru.listviewejemplo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by NINO on 01/01/2018.
 */

public class AdaptadorEquipo extends ArrayAdapter<Equipo> {

    private ArrayList<Equipo> lst_equipo;
    private Context c;

    public AdaptadorEquipo(Context context, ArrayList<Equipo> equipos) {
        super(context, R.layout.item_equipo, equipos);
        this.lst_equipo=equipos;
        this.c=context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_equipo, null);

        int idImagen =  convertView.getResources().getIdentifier(lst_equipo.get(position).getLogo(),"drawable",getContext().getPackageName());


        TextView lblTitulo = (TextView)item.findViewById(R.id.textView);
        lblTitulo.setText(lst_equipo.get(position).getNombre());

        TextView lblSubtitulo = (TextView)item.findViewById(R.id.textView2);
        lblSubtitulo.setText(lst_equipo.get(position).getEstadio());

        return(item);
    }
}
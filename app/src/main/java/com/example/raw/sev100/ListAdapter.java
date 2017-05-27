package com.example.raw.sev100;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by R A W on 27/05/2017.
 */

public class ListAdapter extends ArrayAdapter<TheUnit> {
    private Context context;
    private List<TheUnit> value;

    public ListAdapter(Context context, List<TheUnit> value) {
        super(context, R.layout.list_unit, value);
        this.context = context;
        this.value = value;
    }

    @Override
    public View getView(View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_unit, parent, false);
        TextView kodeUnit = (TextView) rowView.findViewById(R.id.kodeUnit);
        TextView namaUnit = (TextView) rowView.findViewById(R.id.namaUnit);

        kodeUnit.setText(value.getuCode());
        namaUnit.setText(Integer.toString(value.getUname()));
        return rowView;
    }
}

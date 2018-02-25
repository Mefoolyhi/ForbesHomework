package com.example.admin.forbeshomework;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by admin on 25.02.2018.
 */

public class PersAdapter extends ArrayAdapter<Person> {


    public PersAdapter(Context context, ArrayList<Person> arr) {
        super(context, R.layout.list_item, arr);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Person pers = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, null);
        }
        ((TextView) convertView.findViewById(R.id.name)).setText(pers.name);
        ((TextView) convertView.findViewById(R.id.money)).setText(String.valueOf(pers.money));

            ((ImageView) convertView.findViewById(R.id.flag)).setImageResource(getContext().getResources().getIdentifier(pers.flag_res, "drawable", "com.example.admin.forbeshomework"));

        return convertView;
    }
}

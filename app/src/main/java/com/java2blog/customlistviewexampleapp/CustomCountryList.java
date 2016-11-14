package com.java2blog.customlistviewexampleapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.java2blog.customlistviewexampleapp.R;

public class CustomCountryList extends ArrayAdapter<String> {
    private String[] countryNames;
    private String[] capitalNames;
    private Integer[] imageid;
    private Activity context;

    public CustomCountryList(Activity context, String[] countryNames, String[] capitalNames, Integer[] imageid) {
        super(context, R.layout.row_item, countryNames);
        this.context = context;
        this.countryNames = countryNames;
        this.capitalNames = capitalNames;
        this.imageid = imageid;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.row_item, null, true);
        TextView textViewCountry = (TextView) listViewItem.findViewById(R.id.textViewCountry);
        TextView textViewCapital = (TextView) listViewItem.findViewById(R.id.textViewCapital);
        ImageView imageFlag = (ImageView) listViewItem.findViewById(R.id.imageViewFlag);

        textViewCountry.setText(countryNames[position]);
        textViewCapital.setText(capitalNames[position]);
        imageFlag.setImageResource(imageid[position]);
        return  listViewItem;
    }
}
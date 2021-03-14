package com.example.miwokapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends ArrayAdapter<Color> {

    public ColorAdapter(Context context, ArrayList<Color> colors) {
        super(context, 0, colors);
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view_sample_layout, parent, false);
        }

        Color currentColor = getItem(position);

        TextView miwokWordText = listItemView.findViewById(R.id.miwok_transaltion);
        miwokWordText.setText(currentColor.getMiwokColor());

        TextView defaultWordText = listItemView.findViewById(R.id.english_transalation);
        defaultWordText.setText(currentColor.getDefaultColor());

        return listItemView;
    }
}

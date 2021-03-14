package com.example.miwokapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view_sample_layout, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokWordText = listItemView.findViewById(R.id.miwok_transaltion);
        miwokWordText.setText(currentWord.getMiwokTranslation());

        TextView defaultWordText = listItemView.findViewById(R.id.english_transalation);
        defaultWordText.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}

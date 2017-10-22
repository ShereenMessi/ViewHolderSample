package com.example.android.viewholdersample;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Shereen on 10/22/2017.
 */

public class LocationArrayAdapter extends ArrayAdapter<Location> {
    private int resource;

    public LocationArrayAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Location> objects) {
        super(context, resource, objects);
        this.resource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(resource, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.NameTextView = (TextView) convertView.findViewById(R.id.name_text_view);
            viewHolder.AddressTextView = (TextView) convertView.findViewById(R.id.name_text_view);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Location location = getItem(position);
        viewHolder.NameTextView.setText(location.getName());
        viewHolder.AddressTextView.setText(location.getAddress());

        return convertView;
    }

    static class ViewHolder {
        TextView NameTextView;
        TextView AddressTextView;
    }
}


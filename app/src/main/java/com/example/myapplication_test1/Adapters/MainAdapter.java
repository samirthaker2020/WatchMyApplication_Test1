package com.example.myapplication_test1.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication_test1.Modal.ListDetails;
import com.example.myapplication_test1.R;

import java.util.ArrayList;

public class MainAdapter extends BaseAdapter {
    private Context context;
    ViewGroup.LayoutParams l;
    public MainAdapter(Context context, ArrayList<ListDetails> headingArrayList) {
        this.context = context;
        HeadingArrayList = headingArrayList;
    }

    private ArrayList<ListDetails> HeadingArrayList;
    @Override
    public int getCount() {
        return HeadingArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return HeadingArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.mainlistlayout,parent, false);
            convertView.setMinimumHeight(90);


        }
        TextView rowHeading = convertView.findViewById(R.id.txt1);


        ListDetails items = (ListDetails) getItem(position);
        if(items.getDialogHeader() !=null) {
            rowHeading.setText(String.valueOf(items.getDialogHeader()));

        }else {  }
        return convertView;
    }
}

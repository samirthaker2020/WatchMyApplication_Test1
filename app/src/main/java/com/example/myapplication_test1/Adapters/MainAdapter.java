package com.example.myapplication_test1.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.myapplication_test1.Modal.ListDetails;

import java.util.ArrayList;

public class MainAdapter extends BaseAdapter {
    private Context context;
    ViewGroup.LayoutParams l;

    private ArrayList<ListDetails> HeadingArrayList;
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}

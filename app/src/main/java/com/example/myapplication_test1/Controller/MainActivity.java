package com.example.myapplication_test1.Controller;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication_test1.Adapters.MainAdapter;
import com.example.myapplication_test1.Modal.ListDetails;
import com.example.myapplication_test1.R;

import java.util.ArrayList;

public class MainActivity extends WearableActivity implements View.OnClickListener {

    private TextView mTextView;
    LayoutInflater l;
    ListView lst1;
    private ArrayList<ListDetails> lstHeading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
init();
        mTextView = (TextView) findViewById(R.id.text);

        // Enables Always-on
        setAmbientEnabled();
        lst1 = (ListView) findViewById(R.id.lst1);
        l = getLayoutInflater();
        MainAdapter mAdapter = new MainAdapter(this, lstHeading);
        ViewGroup header = (ViewGroup)l.inflate(R.layout.mainheader,null,false);
        header.setEnabled(true);
        header.setClickable(false);
        header.setOnClickListener(new MainActivity());
        // Enables Always-on
        setAmbientEnabled();
        lst1.addHeaderView(header,null,false);
        lst1.setAdapter(mAdapter);
    }

    @Override
    public void onClick(View v) {

    }

    public  void init()
    {
        lstHeading = new ArrayList<>();
        lstHeading.add(new ListDetails("Yes/No action",1));
        lstHeading.add(new ListDetails("One action",2));
        lstHeading.add(new ListDetails("Multiple action",3));
    }

}

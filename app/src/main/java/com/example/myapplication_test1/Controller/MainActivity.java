package com.example.myapplication_test1.Controller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.AcceptDenyDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication_test1.Adapters.MainAdapter;
import com.example.myapplication_test1.Modal.ListDetails;
import com.example.myapplication_test1.R;

import java.util.ArrayList;

public class MainActivity extends WearableActivity implements ListView.OnClickListener {

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

        lst1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListDetails lstItem = lstHeading.get(position-1);
                System.out.println(lstItem.getDialogHeader());
                System.out.println(lstItem.getDno());

                    if(lstItem.getDno() == 1)
                    {
                        yesno();
                    }

            }
        });
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


    public void yesno()
    {
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.yesno_dialog);
        dialog.setTitle("yes/no dialog");
           TextView txt_title= (TextView) dialog.findViewById(R.id.t1_title);
           txt_title.setText("yes/no dialog");
        TextView txt_msg= (TextView) dialog.findViewById(R.id.t1_msg);
        txt_msg.setText("This dialog only has two action available ");
        Button dialogButton1 = (Button) dialog.findViewById(R.id.t1_correct);
        Button dialogButton2 = (Button) dialog.findViewById(R.id.t1_correct2);
// if button is clicked, close the custom dialog
        dialogButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("ok");
                dialog.dismiss();
            }
        }) ;
        dialogButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("cancel");
                dialog.dismiss();
            }
        }) ;
        dialog.show();
    }

}

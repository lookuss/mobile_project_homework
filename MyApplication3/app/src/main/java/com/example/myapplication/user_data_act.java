package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;


public class user_data_act extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_data_dialog);
        login_user_data user_data = (login_user_data)getApplicationContext();
        Button shutdownClick;

        TextView ID = findViewById(R.id.textView19);
        TextView Name = findViewById(R.id.textView18);
        TextView Address = findViewById(R.id.textView17);
        TextView Phonenumber = findViewById(R.id.textView16);
        ID.setText(user_data.getId());
        Name.setText(user_data.getName());
        Address.setText(user_data.getAddress());
        Phonenumber.setText(user_data.getNumber());

        shutdownClick = findViewById(R.id.btn_shutdown);
        shutdownClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }



}

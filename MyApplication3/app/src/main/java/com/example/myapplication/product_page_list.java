package com.example.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class product_page_list extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_page_list);
        login_user_data user_data = (login_user_data)getApplicationContext();
        Button user_data_button = findViewById(R.id.user_data_button);
        user_data_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user_data.getId() == null || user_data.getId().isEmpty()){
                    AlertDialog dialog = create_dialog();
                    dialog.show();
                }else {
                    Intent intent = new Intent(getApplicationContext(), com.example.myapplication.user_data_act.class);
                    startActivity(intent);
                }


            }
        });
    }
    public AlertDialog create_dialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("This menu requires membership registration. Would you like to join?")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), com.example.myapplication.register.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        return builder.create();


    }
}

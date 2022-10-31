package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class register extends Activity {
    Button register_button;
    RadioButton accept_button;
    RadioButton refuse_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        register_button = findViewById(R.id.register_page_regist_button);
        accept_button = findViewById(R.id.accept_radio_button);
        refuse_button = findViewById(R.id.refuse_radio_button);

        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (refuse_button.isChecked()){
                    Toast.makeText(getApplicationContext(), "plz check accept button !",Toast.LENGTH_SHORT).show();
                }else{
                    //id check and password check
                }
            }
        });

    }

}

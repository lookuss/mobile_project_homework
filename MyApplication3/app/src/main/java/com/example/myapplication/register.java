package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;
import androidx.room.Room;



import java.util.List;
import java.util.regex.Pattern;

public class register extends Activity {
    Button register_button;
    RadioButton accept_button;
    RadioButton refuse_button;
    TextView user_id;
    TextView user_password;
    TextView user_name;
    TextView user_Address;
    TextView user_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        register_button = findViewById(R.id.register_page_regist_button);
        accept_button = findViewById(R.id.accept_radio_button);
        refuse_button = findViewById(R.id.refuse_radio_button);
        user_id = findViewById(R.id.editTextTextPersonName2);
        user_password = findViewById(R.id.editTextTextPersonName4);
        user_name = findViewById(R.id.namespace);
        user_Address = findViewById(R.id.adress);
        user_number = findViewById(R.id.number);
        Pattern passPattern = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$");
        Pattern phonenumPattern = Pattern.compile("^\\d{3}\\d{3,4}\\d{4}$");
        Appdatabase db = Room.databaseBuilder(this, Appdatabase.class, "user-db")
                .allowMainThreadQueries()
                .build();
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (refuse_button.isChecked()) {
                    Toast.makeText(getApplicationContext(), "plz check accept button !", Toast.LENGTH_SHORT).show();
                } else {
                    //id check and password check
                    boolean check = true;
                    List<sever> id = db.server_d().getAll();
                    for (int i = 0; i < id.size(); i++) {
                        if (id.get(i).getUser_id().equals(user_id.getText().toString())) {
                            check = false;
                        }
                    }
                    if (check) {
                        String local_user_id = user_id.getText().toString();
                        String local_user_password = user_password.getText().toString();
                        String local_user_name = user_name.getText().toString();
                        String local_user_address = user_Address.getText().toString();
                        String local_user_number = user_number.getText().toString();

                        if (local_user_id.isEmpty() || local_user_id == null) {
                            Toast.makeText(getApplicationContext(), "ID cannot be blank!", Toast.LENGTH_SHORT).show();
                        } else if (!passPattern.matcher(local_user_password).find()) {
                            Toast.makeText(getApplicationContext(), "Password must contain at least 8 characters including English and special characters!", Toast.LENGTH_SHORT).show();
                        } else if (local_user_name.isEmpty() || local_user_name == null) {
                            Toast.makeText(getApplicationContext(), "Name cannot be blank!", Toast.LENGTH_SHORT).show();
                        } else if (local_user_address.isEmpty() || local_user_address == null) {
                            Toast.makeText(getApplicationContext(), "Address cannot be blank!", Toast.LENGTH_SHORT).show();
                        } else if (!phonenumPattern.matcher(local_user_number).find()) {
                            Toast.makeText(getApplicationContext(), "This phone number is not valid!", Toast.LENGTH_SHORT).show();
                        } else {
                            db.server_d().insert(new sever(local_user_id, local_user_password, local_user_name, local_user_address, local_user_number));
                            Toast.makeText(getApplicationContext(), "Congratulations on your membership !!!", Toast.LENGTH_SHORT).show();
                            finish();
                        }

                    }else{
                        Toast.makeText(getApplicationContext(), "This ID is already registered!", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

    }

}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {
    Button register;
    Button login;
    Button pass_button;
    EditText ID;
    EditText password;
    List<sever> id ;
    List<String> pw = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_user_data user_data = (login_user_data)getApplicationContext();



        ID = findViewById(R.id.user_id);
        password = findViewById(R.id.user_password);
        pass_button = findViewById(R.id.pass_button);
        Appdatabase db = Room.databaseBuilder(this, Appdatabase.class, "user-db")
                
                .allowMainThreadQueries()
                .build();
        register = (Button) findViewById(R.id.regist);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_id = String.valueOf(ID.getText());
                String user_password = String.valueOf(password.getText());
                String name;
                String address;
                String number;
                int check = 0;
                id = db.server_d().getAll();
                for(int i=0;i<id.size();i++){
                    String tmp =id.get(i).getUser_id().toString();
                    if(tmp.equals(user_id)){
                        tmp = id.get(i).getUser_password().toString();
                        if(tmp.equals(user_password)){
                            name = id.get(i).getUser_name();
                            address = id.get(i).getUser_address();
                            number = id.get(i).getUser_phonenum();
                            user_data.setId(user_id);
                            user_data.setAddress(address);
                            user_data.setName(name);
                            user_data.setNumber(number);
                            check =1;
                        }
                    }
                }
                if (check == 0){
                    Toast.makeText(getApplicationContext(), "Invalid member information!",Toast.LENGTH_SHORT).show();
                }else{

                    Intent intent = new Intent(getApplicationContext(), product_page_list.class);
                    startActivity(intent);
                }

            }
        });

        register.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), com.example.myapplication.register.class);
            startActivity(intent);
        });
        pass_button.setOnClickListener(view -> {
            user_data.setId("");
            Intent intent = new Intent(getApplicationContext(), product_page_list.class);
            startActivity(intent);
        });
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
    List<String> id = new ArrayList<>();
    List<String> pw = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ID = findViewById(R.id.user_id);
        password = findViewById(R.id.user_password);
        pass_button = findViewById(R.id.pass_button);

        register = (Button) findViewById(R.id.regist);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_id = String.valueOf(ID.getText());
                String user_password = String.valueOf(password.getText());
                int check = 0;
                for(int i=0;i<id.size();i++){
                    if(user_id.equals(id.get(i))){
                        if(user_password.equals(pw.get(i))){
                            check =1;
                        }
                    }
                }
                if (check == 0){
                    Toast.makeText(getApplicationContext(), "올바르지 않은 회원정보 입니다.",Toast.LENGTH_SHORT).show();
                }

            }
        });

        pass_button.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), product_page_list.class);
            startActivity(intent);
        });
    }
}
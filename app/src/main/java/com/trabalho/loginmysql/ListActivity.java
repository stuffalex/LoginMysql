package com.trabalho.loginmysql;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.trabalho.loginmysql.Model.User;


public class ListActivity extends AppCompatActivity {
    private TextView tvUser;

    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        user = (User) getIntent().getSerializableExtra("User");

        tvUser = findViewById(R.id.txtUser);

        if (user != null) {
            tvUser.setText("WELCOME "+user.getName() +" "+user.getLastName());
        }
    }
}
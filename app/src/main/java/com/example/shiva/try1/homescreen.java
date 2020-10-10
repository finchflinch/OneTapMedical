package com.example.shiva.try1;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class homescreen extends AppCompatActivity {
    public Button start_button;
    public Button start_button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        Button start_button=(Button)findViewById(R.id.button2);


        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(com.example.shiva.try1.homescreen.this, com.example.shiva.try1.login.class);

                startActivity(i);
            }
        }





        );

        Button start_button1=(Button)findViewById(R.id.button3);


        start_button1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent in = new Intent(com.example.shiva.try1.homescreen.this, com.example.shiva.try1.Register.class);

                                                startActivity(in);
                                            }
                                        }





        );

    }
}
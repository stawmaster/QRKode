package com.example.qrkode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button generate,scan,open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        generate=findViewById(R.id.idBtnGen);
        scan=findViewById(R.id.idBtnScan);
        open=findViewById(R.id.idBtnOpen);

        generate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i =new Intent(HomeActivity.this,generateQR.class);
                startActivity(i);
            }
        });

        scan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i =new Intent(HomeActivity.this,scanQR.class);
                startActivity(i);
            }
        });

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(HomeActivity.this,activity_open_img.class);
                startActivity(i);
            }
        });
    }
}
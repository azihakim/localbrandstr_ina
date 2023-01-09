package com.pab.localbrandstr_ina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class LandingpageActivity extends AppCompatActivity {
    ImageView img_1;
    ImageView img_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landingpage);

        img_2 = findViewById(R.id.img_2);
        img_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LandingpageActivity.this,LogoActivity.class));
            }
        });
        img_1 = findViewById(R.id.img_1);
        img_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LandingpageActivity.this,StoreActivity.class));
            }
        });
    }
}
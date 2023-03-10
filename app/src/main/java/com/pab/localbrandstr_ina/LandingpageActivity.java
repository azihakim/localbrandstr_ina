package com.pab.localbrandstr_ina;


import static com.pab.localbrandstr_ina.R.menu.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class LandingpageActivity extends AppCompatActivity {
    ImageView img_1;
    ImageView img_2;
    ImageView img_3;

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
//        img_3 = findViewById(R.id.img_3);
//        img_3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(LandingpageActivity.this,AboutActivity.class));
//            }
//        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                startActivity(new Intent(LandingpageActivity.this,AboutActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
package com.pab.localbrandstr_ina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class StoreActivity extends AppCompatActivity {

    RecyclerView rv_store;

    String s1[], s2[], s3[], s4[];
    int images[] = {R.drawable.maternal, R.drawable.thanksinsomnia, R.drawable.rawtype, R.drawable.geoffmax, R.drawable.raughneck, R.drawable.wellborn, R.drawable.insurgentclub, R.drawable.rowndivision, R.drawable.erigo, R.drawable.jiniso};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        rv_store = findViewById(R.id.rv_store);

        s1 = getResources().getStringArray(R.array.store_list);
        s2 = getResources().getStringArray(R.array.desk);
        s3 = getResources().getStringArray(R.array.loc);
        s4 = getResources().getStringArray(R.array.ig);


        StoreAdapter storeAdapter = new StoreAdapter(this, s1, s2, s3, s4, images);
        rv_store.setAdapter(storeAdapter);
        rv_store.setLayoutManager(new LinearLayoutManager(this));
    }
}
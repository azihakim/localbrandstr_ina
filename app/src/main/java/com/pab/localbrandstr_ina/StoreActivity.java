package com.pab.localbrandstr_ina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class StoreActivity extends AppCompatActivity {

    RecyclerView rv_store;

    String s1[], s2[];
    int images[] = {R.drawable.satu, R.drawable.dua, R.drawable.tiga};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        rv_store = findViewById(R.id.rv_store);

        s1 = getResources().getStringArray(R.array.store_list);
        s2 = getResources().getStringArray(R.array.desk);

        StoreAdapter storeAdapter = new StoreAdapter(this, s1, s2, images);
        rv_store.setAdapter(storeAdapter);
        rv_store.setLayoutManager(new LinearLayoutManager(this));
    }
}
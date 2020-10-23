package com.shashi.center_zoom_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Model> model = new ArrayList<>();
    Context context;
    RecyclerView recyclerView;
    public MainActivity() {
    }

    public MainActivity(ArrayList<Model> model, Context context) {
        this.model = model;
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.view_recycler);
        init();
    }
    public void init(){
        RecyclerView.LayoutManager layoutManager = new RecyclerViewCenterZoomLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        Adapter adapterExample = new Adapter(model,this);
        model.add(new Model(R.drawable.image1));
        model.add(new Model(R.drawable.image2));
        model.add(new Model(R.drawable.image3));
        recyclerView.setAdapter(adapterExample);


    }
}
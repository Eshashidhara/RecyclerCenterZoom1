package com.shashi.center_zoom_recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    ArrayList<Model> model = new ArrayList<>();
    Context context;

    public Adapter(ArrayList<Model> model, Context context) {
        this.model = model;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.layout_viewpage_designer,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        holder.imageslider.setImageResource(model.get(position).getImage1());
       // holder.cardLayout.setAnimation(AnimationUtils.loadAnimation(context,R.anim.zoom_in));


    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageslider;
        CardView cardLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageslider = itemView.findViewById(R.id.image_slider);
            cardLayout  =itemView.findViewById(R.id.cardlayout);
        }
    }
}

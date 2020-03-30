package com.example.hw2;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private ArrayList<Restaurant> mRestaurants;

    public MyAdapter(ArrayList<Restaurant> restaurants) {
        mRestaurants = restaurants;

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView name, cuisine, location, rating;

        public MyViewHolder(View v){
            super(v);
            name = v.findViewById(R.id.restaurantTv);
            cuisine = v.findViewById(R.id.cuisineTv);
            location = v.findViewById(R.id.locationTv);
            rating = v.findViewById(R.id.ratingTv);


        }

    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        Restaurant restaurant = mRestaurants.get(position);
        holder.name.setText(restaurant.getName());
        holder.cuisine.setText(restaurant.getCuisine());
        holder.location.setText(restaurant.getLocation());
        holder.rating.setText(restaurant.getRating());


    }

    @Override
    public int getItemCount() {
        return mRestaurants.size();
    }

}

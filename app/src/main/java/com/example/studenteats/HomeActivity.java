package com.example.studenteats;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RestaurantAdapter adapter;
    private List<Restaurant> restaurantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.restaurantList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create Restaurant List
        restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant("Pizza Hut", "Best pizzas in town", R.drawable.ic_cafe));
        restaurantList.add(new Restaurant("Starbucks", "Premium coffee and snacks", R.drawable.ic_cafe));
        restaurantList.add(new Restaurant("KFC", "Crispy chicken meals", R.drawable.ic_cafe));
        restaurantList.add(new Restaurant("Subway", "Fresh sandwiches & salads", R.drawable.ic_cafe));
        restaurantList.add(new Restaurant("McDonald's", "Burgers, fries & more", R.drawable.ic_cafe));
        restaurantList.add(new Restaurant("Domino's", "Cheesy & delicious pizzas", R.drawable.ic_cafe));
        restaurantList.add(new Restaurant("Dunkin' Donuts", "Coffee & fresh donuts", R.drawable.ic_cafe));

        // Set Adapter
        adapter = new RestaurantAdapter(restaurantList);
        recyclerView.setAdapter(adapter);
    }
}
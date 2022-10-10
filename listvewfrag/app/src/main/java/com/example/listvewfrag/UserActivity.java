package com.example.listvewfrag;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listvewfrag.databinding.ActivityUserBinding;
import com.example.androi_tutorial.databinding.ActivityUserBinding;


public class UserActivity extends AppCompatActivity {

    ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent= this.getIntent();

        if(intent != null){
            String name = intent.getStringExtra("name");
            String phone = intent.getStringExtra("phone");
            String country = intent.getStringExtra("country");
            int imageID = intent.getIntExtra("imageId", R.drawable.ic_baseline_home_24);

            binding.nameProfile.setText(name);
            binding.phoneProfile.setText(phone);
            binding.countryProfile.setText(country);
            binding.profileImg.setImageResource(imageID);

        }

    }
}
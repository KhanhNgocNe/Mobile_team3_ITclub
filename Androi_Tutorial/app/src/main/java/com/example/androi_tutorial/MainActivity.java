package com.example.androi_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.androi_tutorial.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {  

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic1,R.drawable.pic3};
        String[] name = {"Rose", "Lily", "Tulip", "Orchid", "Carnation", "Hyacinth", "Peruvian", "Chrysanthemum"};
        String[] lastMassage = {"Hey","Hello","Heo","Het","Hot","Hat","Hop","Hit","Haz"};
        String[] lastMsgTime = {"8:45 am","11:05 am","15:20 pm","6:45 am","20:18 pm","7:37 am","10:11 am"};
        String[] phone = {"123456","123456","123456","123456","123456","123456","123456","123456"};
        String[] country = {"USA", "UK", "Tokyo","Korean","Italy","Vietnam","France"};

        ArrayList<User> userArrayList = new ArrayList<>();
        for(int i=0;i<imageId.length;i++){
            User user = new User(name[i],lastMassage[i],lastMsgTime[i],
                    phone[i],country[i], imageId[i]);

            userArrayList.add(user);
        }
        ListAdapter listAdapter = new ListAdapter(MainActivity.this,userArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, UserActivity.class);
                intent.putExtra("name", name[i]);
                intent.putExtra("phone", phone[i]);
                intent.putExtra("country", country[i]);
                intent.putExtra("imageId", imageId[i]);
                startActivity(intent);
            }
        });
    }
}
package com.example.listvewfrag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.listvewfrag.databinding.ActivityMainBinding;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    ActivityMainBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        int[] imageId = {R.drawable.ic_baseline_favorite_24,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_person_24,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_person_24,R.drawable.ic_baseline_favorite_24};
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
        //ListAdapter listAdapter = new com.example.listvewfrag.ListAdapter(HomeFragment.this, userArrayList);
        //binding.listview.setAdapter(listAdapter);
        //binding.listview.setClickable(true);
        //binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //@Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(HomeFragment.this, UserActivity.class);
//                intent.putExtra("name", name[i]);
//                intent.putExtra("phone", phone[i]);
//                intent.putExtra("country", country[i]);
//                intent.putExtra("imageId", imageId[i]);
//                startActivity(intent);
//            }
        //});
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
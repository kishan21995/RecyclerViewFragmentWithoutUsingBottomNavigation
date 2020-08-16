package com.app.recyclerviewfragmentwithoutusingbottomnavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class NewFragment extends Fragment {

   /* public static NewFragment newInstance() {
        NewFragment fragment = new NewFragment();
        return fragment;
    }*/

  /*  @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }*/

  public NewFragment(){

  }

  RecyclerView recyclerView;
  List<Model>itemList;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_new, container, false);

        recyclerView=view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //initData();

        //use adapter data here
        recyclerView.setAdapter(new ItemAdapter(initData()));



        return view;
    }





    private List<Model>initData(){

        itemList=new ArrayList<>();
        itemList.add(new Model(R.drawable.arman,"video 1"));
        itemList.add(new Model(R.drawable.arman,"video 1"));
        itemList.add(new Model(R.drawable.arman,"video 1"));
        itemList.add(new Model(R.drawable.arman,"video 1"));
        itemList.add(new Model(R.drawable.arman,"video 1"));
        itemList.add(new Model(R.drawable.arman,"video 1"));
        itemList.add(new Model(R.drawable.arman,"video 1"));
        itemList.add(new Model(R.drawable.arman,"video 1"));
        itemList.add(new Model(R.drawable.arman,"video 1"));


        return itemList;
    }

}
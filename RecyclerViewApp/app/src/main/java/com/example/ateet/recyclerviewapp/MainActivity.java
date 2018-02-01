package com.example.ateet.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyAdapter myAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<MyList> mLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.list_recycler_view);
        mLists = new ArrayList<>();

        MyList item1 = new MyList();
        item1.setTitle("I am");
        item1.setDesc("amazing");
        MyList item2 = new MyList();
        item2.setTitle("You are");
        item2.setDesc("awesome");

        mLists.add(item1);
        mLists.add(item2);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        myAdapter = new MyAdapter(mLists, getApplicationContext());
        mRecyclerView.setAdapter(myAdapter);

    }
}

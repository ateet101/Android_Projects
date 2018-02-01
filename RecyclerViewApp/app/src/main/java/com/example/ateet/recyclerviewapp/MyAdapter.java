package com.example.ateet.recyclerviewapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by ateet on 11/19/16.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    private List<MyList> mLists;
    private Context context;

    public MyAdapter(List<MyList> mLists, Context context){
        this.context = context;
        this.mLists = mLists;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.recylcler_list,parent, false);
        MyHolder holder = new MyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        MyList list_item = mLists.get(position);
        holder.bindHolder(list_item);
    }

    @Override
    public int getItemCount() {
        return mLists.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView desc;

        public MyHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.etTitle);
            desc = (TextView) itemView.findViewById(R.id.etDesc);
        }

        public void bindHolder(MyList list){
            title.setText(list.getTitle());
            desc.setText(list.getDesc());
        }
    }
}


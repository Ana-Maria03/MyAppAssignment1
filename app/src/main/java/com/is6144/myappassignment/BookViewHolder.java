package com.is6144.myappassignment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends RecyclerView.ViewHolder {

    public TextView tView3;

    public Button item_btn;



    public BookViewHolder( View itemView) {
        super(itemView);

        this.tView3= itemView.findViewById(R.id.tView3);

        this.item_btn= itemView.findViewById(R.id.item_btn);


    }
}

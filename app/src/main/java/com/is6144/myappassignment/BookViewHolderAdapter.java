package com.is6144.myappassignment;

import android.content.Context;
import android.content.Intent;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolderAdapter extends RecyclerView.Adapter<BookViewHolder> {
    static final String TAG= "Book Adapter";
    private Book[] arrayBook;


    public BookViewHolderAdapter(Book[] arrayBook) {this.arrayBook = arrayBook;}




    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View item_layout = inflater.inflate(R.layout.item_layout,parent, false);



        BookViewHolder bookViewHolder =  new BookViewHolder(item_layout);
        return bookViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        final Book book = arrayBook[position];

        holder.tView3.setText(book.getTitle());//


        holder.item_btn.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Log.d(TAG, String.valueOf(book.getId()));
                Intent intent = new Intent(holder.tView3.getContext(),Book_Activity.class );
                intent.putExtra("title", holder.tView3.getText());
                holder.tView3.getContext().startActivity(intent);
            }

        });

    }



    @Override
    public int getItemCount() {
        return arrayBook.length;
    }
}

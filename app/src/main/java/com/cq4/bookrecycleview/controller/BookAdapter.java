package com.cq4.bookrecycleview.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cq4.bookrecycleview.R;
import com.cq4.bookrecycleview.model.Book;
import com.cq4.bookrecycleview.view.ViewHolder;

import java.util.List;

/**
 * Created by melina.gonzalez on 11/5/17.
 */



public class BookAdapter extends RecyclerView.Adapter<ViewHolder> {

    private final List<Book> bookList;

    public BookAdapter(List<Book>bookList){
        this.bookList = bookList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_itemview, parent, false);
        return new ViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Book book = bookList.get(position);

        holder.onBind(book);

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }



}

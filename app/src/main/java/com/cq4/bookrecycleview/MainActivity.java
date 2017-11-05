package com.cq4.bookrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cq4.bookrecycleview.controller.BookAdapter;
import com.cq4.bookrecycleview.model.Book;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView bookRecyclerView = (RecyclerView) findViewById(R.id.book_recyclerview);



        List<Book> books = new ArrayList<>();
        books.add(new Book("In the Now", "Volume 1", "Mel",1997));
        books.add(new Book("Star Wars", "Volume 1", "George Lucas", 1992));
        books.add(new Book("Iron Man", "Volume 2", "Jon Favreau", 2007));
        books.add(new Book("The Avengers", "Volume 1","Joss Whedon", 2011));
        books.add(new Book("28 Days Later", "Volume 1", "Danny Boyle", 2002));
        books.add(new Book("Guardians of the Galaxy", "Volume 1", "James Gunn", 1993));
        books.add(new Book("Sneakers", "Volume 2", "Phil Alden Robinson",1992));
        books.add(new Book("Clear and Present Danger","Volume 1" , "Phillip Noyce",1994));

        BookAdapter bookAdapter = new BookAdapter(books);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        bookRecyclerView.setAdapter(bookAdapter);
        bookRecyclerView.setLayoutManager(linearLayoutManager);
    }


}

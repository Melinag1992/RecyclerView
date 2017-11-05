package com.cq4.bookrecycleview.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.cq4.bookrecycleview.R;
import com.cq4.bookrecycleview.model.Book;

import org.w3c.dom.Text;

/**
 * Created by melina.gonzalez on 11/5/17.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView booktitle;
    private TextView bookaurthor;
    private TextView bookModel;
    private TextView publishedYear;

    public ViewHolder(View itemView){
        super(itemView);
        booktitle = (TextView) itemView.findViewById(R.id.book_title_textview);
        bookaurthor = (TextView) itemView.findViewById(R.id.book_author_textview);
        bookModel = (TextView) itemView.findViewById(R.id.book_model_textview);
        publishedYear = (TextView) itemView.findViewById(R.id.book_publish_date_textview);

    }
    public void onBind(Book book) {
        booktitle.setText("Title: " + book.getBookTitle());
        bookModel.setText("Model: "+ book.getBookModel());
        bookaurthor.setText("Author: " + book.getBookAuthor());
        publishedYear.setText("Published Year: " + book.getPublishingYear());

    }

}

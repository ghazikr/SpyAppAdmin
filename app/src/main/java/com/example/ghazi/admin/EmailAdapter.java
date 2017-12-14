package com.example.ghazi.admin;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.ItemViewHolder> {

    private Context context;
    private ArrayList<Email> itemList;

    public EmailAdapter(Context context, ArrayList<Email> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext())
                .inflate(R.layout.email_cardview_layout, parent, false);

        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Email email= itemList.get(position);

        holder.content.setText(email.getContent());
        holder.receivedTime.setText(email.getReceivedTime());
        holder.sender.setText(email.getSender());
        holder.subject.setText(email.getSubject());

    }

    @Override
    public int getItemCount() {
        if (itemList != null) {
            return itemList.size();
        }
        return 0;
    }


    //ViewHolder class
    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        public CardView cvItem;
        public TextView subject,content;
        public TextView receivedTime;
        public TextView sender;


        public ItemViewHolder(View itemView) {
            super(itemView);
            cvItem = (CardView) itemView.findViewById(R.id.cardViewNotification);
            subject = (TextView) itemView.findViewById(R.id.subjectEmail);
            content = (TextView) itemView.findViewById(R.id.contentEmail);
            receivedTime = (TextView) itemView.findViewById(R.id.receivedTimeEmail);
            sender = (TextView) itemView.findViewById(R.id.senderEmail);


        }
    }
}


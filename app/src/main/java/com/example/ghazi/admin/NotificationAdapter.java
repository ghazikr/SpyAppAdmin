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

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ItemViewHolder> {

    private Context context;
    private ArrayList<Notification> itemList;

    public NotificationAdapter(Context context, ArrayList<Notification> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext())
                .inflate(R.layout.notification_cardview_layout, parent, false);

        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Notification notification= itemList.get(position);

        holder.content.setText(notification.getContent());
        holder.receivedTime.setText(notification.getReceivedTime());
        holder.sender.setText(notification.getSender());
       // holder.type.setText(notification.getType());

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
        public TextView content;
        public TextView receivedTime;
        public TextView sender;
        //public TextView type;

        public ItemViewHolder(View itemView) {
            super(itemView);
            cvItem = (CardView) itemView.findViewById(R.id.cardViewNotification);
            content = (TextView) itemView.findViewById(R.id.content);
            receivedTime = (TextView) itemView.findViewById(R.id.receivedTime);
            sender = (TextView) itemView.findViewById(R.id.senderNotif);
           // type = (TextView) itemView.findViewById(R.id.typeNotif);

        }
    }
}



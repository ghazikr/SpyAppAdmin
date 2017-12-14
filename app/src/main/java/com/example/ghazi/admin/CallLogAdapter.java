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

public class CallLogAdapter extends RecyclerView.Adapter<CallLogAdapter.ItemViewHolder> {

    private Context context;
    private ArrayList<CallLog> itemList;

    public CallLogAdapter(Context context, ArrayList<CallLog> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext())
                .inflate(R.layout.call_log_cardview_layout, parent, false);

        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        CallLog callLog = itemList.get(position);

        holder.callDate.setText(callLog.getCallDate().toString());
        holder.callDuration.setText(callLog.getCallDurationSeconds());
        holder.callType.setText(callLog.getCallType());
        holder.phoneNumber.setText(callLog.getPhoneNumber());

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
        public TextView callDate;
        public TextView callDuration;
        public TextView callType;
        public TextView phoneNumber;

        public ItemViewHolder(View itemView) {
            super(itemView);
            cvItem = (CardView) itemView.findViewById(R.id.cardViewCall);
            callDate = (TextView) itemView.findViewById(R.id.callDate);
            callDuration = (TextView) itemView.findViewById(R.id.callDurationSeconds);
            callType = (TextView) itemView.findViewById(R.id.callType);
            phoneNumber = (TextView) itemView.findViewById(R.id.phoneNumber);

        }
    }
}


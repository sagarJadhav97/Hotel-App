package com.fydhos.tsj97.hotel_sec.room_desing_sec;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.fydhos.tsj97.R;

import java.util.ArrayList;


public class Adapter_room extends RecyclerView.Adapter<Adapter_room.myViewHolder>{
    private Context context;
    private ArrayList<data_process> coll_list;

    public Adapter_room(Context context, ArrayList<data_process> coll_list) {
        this.context = context;
        this.coll_list = coll_list;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.room_card_desing,parent,false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        data_process pos = coll_list.get(position);
        holder.hotel_title.setText(pos.getHotel_name());
        holder.hotel_loc.setText(pos.getLoc_for_hot());
        holder.hotel_price.setText(pos.getOffer());
        Glide.with(context)
                .load(pos.getImage())
                .into(holder.hotel_cover);


    }

    @Override
    public int getItemCount() {
        return coll_list.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        ImageView hotel_cover;
        TextView hotel_title,hotel_loc,hotel_price;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            hotel_cover = itemView.findViewById(R.id.hotel_card_view_image);
            hotel_title = itemView.findViewById(R.id.hotel_card_view_title);
            hotel_loc = itemView.findViewById(R.id.hotel_card_view_location);
            hotel_price = itemView.findViewById(R.id.hotel_card_view_offer);
        }
    }

}

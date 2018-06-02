package com.bijay.jsonparsingwithretrofit;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Bijay on 6/2/2018.
 */

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder>{

    Context context;
    List<MenuModalClass> menuModalClasses;

    public RecyclerviewAdapter(Context context, List<MenuModalClass> menuModalClasses) {
        this.context = context;
        this.menuModalClasses = menuModalClasses;
    }

    @NonNull
    @Override
    public RecyclerviewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapter.MyViewHolder holder, int position) {

        //// getting data according to position

        final MenuModalClass menuModalClass = menuModalClasses.get(position);

        //// getting the item price and displaying in txt_item_price

        holder.txt_item_price.setText(menuModalClass.getItem_Price());


        holder.txt_item_name.setText(menuModalClass.getItem_Name());
        holder.txt_item_desc.setText(menuModalClass.getItem_Desc_English());

        /// loading image in image view

        Glide.with(context)
                .load("http://vedisapp.berlin-webdesign-agentur.de/Image/"+menuModalClass.getImage())
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.item_image);

    ///// click listener in recycler view

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You clicked "+menuModalClass.getItem_Name(), Toast.LENGTH_SHORT).show();
                System.out.println("ItemName "+menuModalClass.getItem_Name());

                Intent intent = new Intent(context,SecondActivity.class);
                intent.putExtra("itemName",menuModalClass.getItem_Name());
                intent.putExtra("itemPrice",menuModalClass.getItem_Price());
                context.startActivity(intent);

                //context.startActivity(new Intent(context,SecondActivity.class));
            }
        });




    }

    @Override
    public int getItemCount() {
        return menuModalClasses.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txt_item_name,txt_item_desc,txt_item_price;
        ImageView item_image;

        public MyViewHolder(View itemView) {
            super(itemView);

            txt_item_desc = itemView.findViewById(R.id.item_desc);
            txt_item_name = itemView.findViewById(R.id.item_name);
            txt_item_price = itemView.findViewById(R.id.item_price);
            item_image = itemView.findViewById(R.id.item_image);

        }
    }
}

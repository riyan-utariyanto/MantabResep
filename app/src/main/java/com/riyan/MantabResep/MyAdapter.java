package com.riyan.MantabResep;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by riyan on 21/09/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    String judul[],deskp[],bahan2[],langkah2[];
    int icon[],image[];
    Context ctx;

    public MyAdapter(Context ct, String s1[], String s2[], String s3[],String s4[], int ic[],int img[]){
        judul = s1;
        deskp = s2;
        bahan2 = s3;
        langkah2 = s4;
        image = img;
        icon = ic;
        ctx = ct;
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myInflater = LayoutInflater.from(ctx);
        View v = myInflater.inflate(R.layout.item_list,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.t1.setText(judul[position]);
        holder.t2.setText(deskp[position]);
        holder.myImage.setImageResource(icon[position]);

    }

    @Override
    public int getItemCount() {
        return judul.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        TextView t1,t2;
        ImageView myImage;
        View mView;
        Context con;
        public MyHolder(View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.text1);
            t2 = (TextView) itemView.findViewById(R.id.text2);
            myImage = (ImageView) itemView.findViewById(R.id.myImage);

            itemView.setOnClickListener(this);
            mView = itemView;
            con = itemView.getContext();
        }

        @Override
        public void onClick(View mView) {
            int position = getAdapterPosition();
            //Toast.makeText(con, "Menu di posisi " + position, Toast.LENGTH_SHORT).show();
            Intent i = new Intent(con,Nasi.class);
            i.putExtra("judul",judul[position]);
            i.putExtra("image",image[position]);
            i.putExtra("bahan2",bahan2[position]);
            i.putExtra("langkah2",langkah2[position]);

            con.startActivity(i);
        }
    }

}

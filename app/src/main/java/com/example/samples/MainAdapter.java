package com.example.samples;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
   //ArrayList<Model1> model1;
   List<Model1> model1;
   Context context;
   String pos;
   item_counter counter;

   public MainAdapter(Context context, ArrayList<Model1> model1,item_counter counter){
       this.counter=counter;
       this.context=context;
       this.model1=model1;
   }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.one_row,parent,false);


        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //holder.image.setImageResource(model1.get(position).getImages());
        InputStream inputStream = null;
        try {
            inputStream = context. getContentResolver().openInputStream(model1.get(position).getImages());
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            holder.image.setImageBitmap(bitmap);



            holder.clearimage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    model1.remove(holder.getAdapterPosition());
                    notifyDataSetChanged();
                }
            });

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return model1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image,clearimage;
       public ViewHolder(View itemView){
           super(itemView);
           image=itemView.findViewById(R.id.image);
           clearimage=itemView.findViewById(R.id.clear_imager);

       }
    }
}

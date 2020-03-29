package com.qianzm.helloworld.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.qianzm.helloworld.R;

public class StaggeredAdapter extends RecyclerView.Adapter<StaggeredAdapter.LinearViewHolder> {
    private Context mContext;

    public StaggeredAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public StaggeredAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_staggered_grid_recyclerview_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredAdapter.LinearViewHolder holder, final int position) {
        if (position%2 == 0){
            holder.imageView.setImageResource(R.drawable.iron_man);
        }else {
            holder.imageView.setImageResource(R.drawable.iron_man_2);
        }
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"click..."+position,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends  RecyclerView.ViewHolder{

        private ImageView imageView;
        public LinearViewHolder(View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
        }
    }


}

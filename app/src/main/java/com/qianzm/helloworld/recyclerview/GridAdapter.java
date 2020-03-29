package com.qianzm.helloworld.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.qianzm.helloworld.R;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.LinearViewHolder> {
    private Context mContext;

    public GridAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public GridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_grid_recyclerview_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.LinearViewHolder holder, final int position) {
        holder.textView.setText("Hello");
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"click..."+position,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 80;
    }

    class LinearViewHolder extends  RecyclerView.ViewHolder{

        private TextView textView;
        public LinearViewHolder(View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }


}

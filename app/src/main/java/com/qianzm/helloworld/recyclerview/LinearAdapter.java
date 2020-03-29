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

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder> {
    private Context mContext;

    public LinearAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public LinearAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0 ){
            return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item,parent,false));
        }else {
            return new LinearViewHolder2(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item2,parent,false));
        }


    }

    @Override
    public int getItemViewType(int position) {
        if (position%2 == 0){
            return 0;
        }else {
            return 1;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull LinearAdapter.LinearViewHolder holder, final int position) {

        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"click..."+position,Toast.LENGTH_SHORT).show();
            }
        });

        if (getItemViewType(position)%2 == 0){
            holder.textView.setText("Hello world!");
        }else {
            holder.textView.setText("你好,世界!");

        }

    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends  RecyclerView.ViewHolder{

        private TextView textView;
        public LinearViewHolder(View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }

    class LinearViewHolder2 extends  LinearViewHolder{

        private TextView textView;
        private ImageView imageView;

        public LinearViewHolder2(View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
            imageView = itemView.findViewById(R.id.iv_image);
        }
    }
}

package com.qianzm.helloworld.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.qianzm.helloworld.R;

public class MyGridViewAdapter extends BaseAdapter {
    private  Context mContext;
    private LayoutInflater layoutInflater;
    public  MyGridViewAdapter(Context context){
        this.mContext = context;
        layoutInflater = LayoutInflater.from(context);

    }


    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        private ImageView imageView;
        private TextView textView;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.layout_grid_item,null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv_grid);
            holder.textView = convertView.findViewById(R.id.tv_title);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textView.setText("花");
        Glide.with(mContext).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1585379542711&di=bad3cbc4ef16ad19e0b1fbb8cb55f67c&imgtype=0&src=http%3A%2F%2Fwww.pyxymg.com%2Flm%2Fxinyuan%2FUploadFiles%2Fimage%2F20180330%2F20180330105959235923.jpg").into(holder.imageView);
        return convertView;
    }
}

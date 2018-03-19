package com.idouble.myapplication;

import android.content.Context;
import android.media.Image;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */

public class MyAdapter extends BaseAdapter {
    private List<ItemBean> mList;
    private LayoutInflater mInflater;

    public MyAdapter(Context context, List<ItemBean> list){

        mList = list;
        mInflater = LayoutInflater.from (context);
    }


    @Override
    public int getCount() {
        return mList.size ();
    }

    @Override
    public Object getItem(int position) {
        return mList.get (position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView != null){
            viewHolder = new ViewHolder ();
//            convertView = mInflater.inflate (R.layout.,null);
//            viewHolder.imageView = (ImageView) convertView.findViewById ();
//            viewHolder.title = (TextView) convertView.findViewById ();
//            viewHolder.content = (TextView)convertView.findViewById ();
//

        }
        return convertView;
    }

    private class ViewHolder {
        public ImageView imageView;
        public TextView title;
        public TextView content;
    }
}

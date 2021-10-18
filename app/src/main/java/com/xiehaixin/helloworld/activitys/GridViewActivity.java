package com.xiehaixin.helloworld.activitys;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.xiehaixin.helloworld.R;

public class GridViewActivity extends AppCompatActivity {

    private GridView gridView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView = findViewById(R.id.gv_one);
        gridView.setAdapter(new MyAdapter(GridViewActivity.this));
    }

    static class MyAdapter extends BaseAdapter{

        private Context context;
        private LayoutInflater layoutInflater;

        public MyAdapter(Context context) {
            this.context = context;
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
            public ImageView iv;
            public TextView tv;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if(convertView == null){
                convertView = layoutInflater.inflate(R.layout.layout_grid_item, null);
                holder = new ViewHolder();
                holder.iv = convertView.findViewById(R.id.iv_one);
                holder.tv = convertView.findViewById(R.id.tv_one);
                convertView.setTag(holder);
            }else{
                holder = (ViewHolder) convertView.getTag();
            }
            holder.tv.setText("花");
            Glide.with(context).load("https://img1.baidu.com/it/u=1297708031,1496306909&fm=224&fmt=auto&gp=0.jpg").into(holder.iv);
            return convertView;
        }
    }
}

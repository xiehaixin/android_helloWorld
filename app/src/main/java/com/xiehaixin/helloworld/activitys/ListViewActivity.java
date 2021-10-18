package com.xiehaixin.helloworld.activitys;


import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.xiehaixin.helloworld.R;

public class ListViewActivity extends AppCompatActivity {

    private ListView lv1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lv1 = findViewById(R.id.lv_1);
        lv1.setAdapter(new MyListAdapter(ListViewActivity.this));

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, "click: "+ position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    static class MyListAdapter extends BaseAdapter{

        private Context context;

        private LayoutInflater layoutInflater;

        public MyListAdapter(Context context) {
            this.context = context;
            this.layoutInflater  = LayoutInflater.from(context);
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

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder viewHolder = null;
            if(convertView == null){
                convertView = layoutInflater.inflate(R.layout.layout_list_item, null);
                viewHolder = new ViewHolder();
                viewHolder.iv = convertView.findViewById(R.id.iv_one);
                viewHolder.tv1 = convertView.findViewById(R.id.tv_one);
                viewHolder.tv2 = convertView.findViewById(R.id.tv_two);
                viewHolder.tv3 = convertView.findViewById(R.id.tv_three);
                convertView.setTag(viewHolder);
            }else{
                viewHolder = (ViewHolder) convertView.getTag();
            }
            viewHolder.tv1.setText("好内容");
            viewHolder.tv2.setText("2088-01-01");
            viewHolder.tv3.setText("no");
            Glide.with(context).load("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png").into(viewHolder.iv);
            return convertView;
        }

        static class ViewHolder{
            public ImageView iv;
            public TextView tv1, tv2, tv3;
        }


    }
}

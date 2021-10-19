package com.xiehaixin.helloworld.RecyclerViews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

import com.xiehaixin.helloworld.R;

public class LinearRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView rv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycler_view);

        rv1 = findViewById(R.id.rv_1);
        rv1.setLayoutManager(new LinearLayoutManager(LinearRecyclerViewActivity.this));
        rv1.setAdapter(new LinearAdapter(LinearRecyclerViewActivity.this));
        rv1.addItemDecoration(new LinearRecyclerViewActivity.MyDecoration());
    }

    static class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0, 0, 0, 2);
        }
    }
}
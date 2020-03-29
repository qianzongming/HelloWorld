package com.qianzm.helloworld.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

import com.qianzm.helloworld.R;

public class PURecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRvPu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu_recycler_view);

        mRvPu = findViewById(R.id.rv_pu);
        mRvPu.addItemDecoration(new MyDecoration());
        mRvPu.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        mRvPu.setAdapter(new StaggeredAdapter(PURecyclerViewActivity.this));
    }

    class MyDecoration extends  RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            int gap = getResources().getDimensionPixelOffset(R.dimen.dividerHeight2);
            outRect.set(gap,gap,gap,gap);
        }
    }
}

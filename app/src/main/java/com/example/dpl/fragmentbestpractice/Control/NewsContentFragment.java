package com.example.dpl.fragmentbestpractice.Control;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dpl.fragmentbestpractice.R;


public class NewsContentFragment extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.news_content_frag,container,false);//获取布局
        return view;
    }

    /**
     * 将新闻内容和标题显示到界面上
     */
    public void refresh(String newsTitle,String newsContent){
        View visibilityLayout=view.findViewById(R.id.visibility_layout);//获取子布局
        visibilityLayout.setVisibility(View.VISIBLE);//布局设置为可见
        TextView newsTitleText= (TextView) view.findViewById(R.id.news_title);
        TextView newsContentText= (TextView) view.findViewById(R.id.news_content);
        newsTitleText.setText(newsTitle);//刷新标题
        newsContentText.setText(newsContent);//刷新内容
    }
}

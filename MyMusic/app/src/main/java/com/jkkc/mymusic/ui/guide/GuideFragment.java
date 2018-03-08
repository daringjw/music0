package com.jkkc.mymusic.ui.guide;

import android.net.Uri;

import com.jkkc.mymusic.R;
import com.jkkc.mymusic.ui.widget.CustomView;

/**
 * Created by Guan on 2018/3/8.
 */

public class GuideFragment extends LoadFragment {


    //构造出一个自定义的播放控件
    private CustomView mCustomView;
    public GuideFragment() {
        // Required empty public constructor
    }


    @Override
    protected void lazyLoadData() {
        mCustomView = findViewById(R.id.cv);
        int index = getArguments().getInt("index");
        Uri uri;
        if(index == 1){
            uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.guide_1);
        }else if(index == 2){

            uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.guide_2);
        }else {

            uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.guide_3);
        }

        mCustomView.playVideo(uri);
    }

    @Override
    protected int setContentView() {
        return R.layout.fragment_guide;
    }


    @Override
    protected void stopLoad() {
        super.stopLoad();
        if(mCustomView != null){
            mCustomView.stopPlayback();
        }
    }


}

package com.jkkc.mymusic.ui.guide;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jkkc.mymusic.R;
import com.jkkc.mymusic.ui.widget.CustomView;

/**
 * Created by Guan on 2018/3/8.
 */

public class GuideFragment extends Fragment {


    private CustomView mCustomView;

    //构造出一个自定义播放控件
    public GuideFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        mCustomView = new CustomView(getContext());
        int index = getArguments().getInt("index");
        Uri uri;
        if (index == 1) {
            uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.guide_1);

        } else if (index == 2) {
            uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.guide_2);

        } else {

            uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.guide_3);

        }

        mCustomView.playVideo(uri);

//        View view = View.inflate(getActivity(), R.layout.activity_guide, null);

        return mCustomView;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        if (mCustomView != null) {
            mCustomView.stopPlayback();

        }


    }


}

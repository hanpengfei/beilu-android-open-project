package com.scj.beilu.app.ui.preview.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.scj.beilu.app.mvp.common.bean.PicPreviewBean;
import com.scj.beilu.app.ui.preview.PicPreviewItemFrag;

import java.util.ArrayList;

/**
 * @author Mingxun
 * @time on 2019/2/20 18:05
 */
public class PicPreviewPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<PicPreviewBean> mImagePathList;

    public PicPreviewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setImagePathList(ArrayList<PicPreviewBean> imagePathList) {
        mImagePathList = imagePathList;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return PicPreviewItemFrag.newInstance(mImagePathList.get(position));
    }


    @Override
    public int getCount() {
        return mImagePathList == null ? 0 : mImagePathList.size();
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }

}

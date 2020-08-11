package com.scj.beilu.app.ui.preview.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.scj.beilu.app.mvp.fit.bean.FitRecordImgInfoBean;
import com.scj.beilu.app.ui.preview.FitRecordAlbumPreviewFrag;

import java.util.List;

/**
 * @author Mingxun
 * @time on 2019/3/15 17:30
 */
public class FitRecordAlbumPreviewPagerAdapter extends FragmentStatePagerAdapter {

    private List<FitRecordImgInfoBean> mImagePathList;

    public FitRecordAlbumPreviewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setImagePathList(List<FitRecordImgInfoBean> imagePathList) {
        mImagePathList = imagePathList;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return FitRecordAlbumPreviewFrag.newInstance(mImagePathList.get(position));
    }
    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
    @Override
    public int getCount() {
        return mImagePathList == null ? 0 : mImagePathList.size();
    }
}

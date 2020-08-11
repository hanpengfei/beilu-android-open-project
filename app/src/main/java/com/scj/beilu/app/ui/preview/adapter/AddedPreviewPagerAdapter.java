package com.scj.beilu.app.ui.preview.adapter;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.scj.beilu.app.ui.preview.AddedPreviewItemFrag;

import java.util.List;

/**
 * @author Mingxun
 * @time on 2019/2/20 18:05
 */
public class AddedPreviewPagerAdapter extends FragmentStatePagerAdapter {

    private List<Uri> mImagePathList;


    public AddedPreviewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setImagePathList(List<Uri> imagePathList) {
        mImagePathList = imagePathList;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return AddedPreviewItemFrag.newInstance(mImagePathList.get(position));
    }

    public void remove(int position) {
        mImagePathList.remove(position);
        notifyDataSetChanged();
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

package com.scj.beilu.app.ui.find.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mx.pro.lib.fragmentation.support.SupportFragment;

import java.util.List;

public class FindManagerPagerAdapter extends FragmentPagerAdapter {

    private List<SupportFragment> mFindInfoListFrags;

    public FindManagerPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setFindInfoListFrags(List<SupportFragment> findInfoListFrags) {
        mFindInfoListFrags = findInfoListFrags;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return mFindInfoListFrags.get(position);
    }

    @Override
    public int getCount() {
        return mFindInfoListFrags == null ? 0 : mFindInfoListFrags.size();
    }
}

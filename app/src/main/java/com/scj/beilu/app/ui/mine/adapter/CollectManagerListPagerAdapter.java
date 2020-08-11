package com.scj.beilu.app.ui.mine.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.scj.beilu.app.ui.mine.MineCollectFrag;

/**
 * @author Mingxun
 * @time on 2019/4/9 17:52
 */
public class CollectManagerListPagerAdapter extends FragmentPagerAdapter {
    private String[] mTitles;

    public CollectManagerListPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setTitles(String[] titles) {
        mTitles = titles;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return MineCollectFrag.newInstance(position);
    }

    @Override
    public int getCount() {
        return mTitles == null ? 0 : mTitles.length;
    }
}

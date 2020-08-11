package com.scj.beilu.app.ui.mine.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.scj.beilu.app.ui.mine.MineMsgFrag;

/**
 * @author Mingxun
 * @time on 2019/1/14 20:00
 */
public class MsgManagerPagerAdapter extends FragmentPagerAdapter {

    private String[] mTitles;

    public MsgManagerPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setTitles(String[] titles) {
        mTitles = titles;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return MineMsgFrag.newInstance(position);
    }

    @Override
    public int getCount() {
        return mTitles == null ? 0 : mTitles.length;
    }
}

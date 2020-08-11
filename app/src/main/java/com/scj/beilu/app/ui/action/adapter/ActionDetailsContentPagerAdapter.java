package com.scj.beilu.app.ui.action.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.scj.beilu.app.mvp.action.bean.ActionInfoBean;
import com.scj.beilu.app.ui.action.ActionDetailsContentFrag;

import java.util.ArrayList;

/**
 * @author Mingxun
 * @time on 2019/3/18 21:16
 */
public class ActionDetailsContentPagerAdapter extends FragmentStatePagerAdapter {
    private ArrayList<ActionInfoBean> mActionSortInfoBeans;

    public ActionDetailsContentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setActionSortInfoBeans(ArrayList<ActionInfoBean> actionSortInfoBeans) {
        mActionSortInfoBeans = actionSortInfoBeans;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        ActionInfoBean infoBean = mActionSortInfoBeans.get(position);

        return ActionDetailsContentFrag.newInstance(infoBean.getActionId(), infoBean.getActionName());
    }

    @Override
    public int getCount() {
        return mActionSortInfoBeans == null ? 0 : mActionSortInfoBeans.size();
    }
}

package com.scj.beilu.app.mvp.base;

import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.mx.pro.lib.mvp.network.config.BaseMvpPresenter;
import com.scj.beilu.app.R;

/**
 * author:SunGuiLan
 * date:2019/2/18
 * descriptin:
 */
public class TabShopPhotoDetailsPresent<V extends TabView> extends BaseMvpPresenter<V> {
    public TabShopPhotoDetailsPresent(Context context) {
        super(context);
    }

    public View getTabLayout(CharSequence title) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_shop_photo_details_item, null);
        TextView tvTab = view.findViewById(R.id.tv_tab_item);
        tvTab.setText(title);
        return view;
    }

    public void setTabSelector(TabLayout.Tab tab, boolean selected) {
        View view = tab.getCustomView();
        TextView tvTab = view.findViewById(R.id.tv_tab_item);
        tvTab.setSelected(selected);
        if (selected) {
            tvTab.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        } else {
            tvTab.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        }
    }
}

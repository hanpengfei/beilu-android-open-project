package com.scj.beilu.app.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;

import com.mx.pro.lib.fragmentation.support.SupportActivity;
import com.scj.beilu.app.R;
import com.scj.beilu.app.widget.AppToolbar;

/**
 * @author Mingxun
 * @time on 2019/2/15 21:28
 */
public abstract class BaseSupportAct extends SupportActivity implements Toolbar.OnMenuItemClickListener {
    private ProgressDialog mProgressDialog;
    protected AppToolbar mAppToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    protected void initView() {
        mAppToolbar = findViewById(R.id.toolbar);

        if (mAppToolbar != null) {
            mAppToolbar.setNavigationOnClickListener(v -> onBackPressedSupport());
            mAppToolbar.setOnMenuItemClickListener(this);
        }

    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;
    }


}

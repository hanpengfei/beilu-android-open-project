package com.mx.pro.lib.mvp;

import androidx.annotation.NonNull;
import androidx.annotation.UiThread;

public interface MvpPresenter<V extends MvpView> {

    @UiThread
    void attachView(@NonNull V view);

    @UiThread
    void detachView();

    @UiThread
    void destroy();
}

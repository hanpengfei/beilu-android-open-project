package com.scj.beilu.app.widget.bottom;

import android.content.Context;
import android.content.res.TypedArray;

/**
 * @author Mingxun
 * @time on 2018/12/21 16:25
 */
class ThemeUtils {
    private static final int[] APPCOMPAT_CHECK_ATTRS = {
            androidx.appcompat.R.attr.colorPrimary
    };

    static void checkAppCompatTheme(Context context) {
        TypedArray a = context.obtainStyledAttributes(APPCOMPAT_CHECK_ATTRS);
        final boolean failed = !a.hasValue(0);
        a.recycle();
        if (failed) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme "
                    + "(or descendant) with the design library.");
        }
    }
}

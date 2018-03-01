package com.robot.pluspubliclib.widget.loadingpage;

import android.content.Context;
import android.view.View;

import com.ayti.loadinglayout.BasePage;

/**
 * Created by lny on 2018/2/27.
 */

public class ErrorPage extends BasePage {
    public ErrorPage(Context context) {
        super(context);
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public int pageViewLayoutId() {
        return 0;
    }

    @Override
    public View getOnReloadView() {
        return null;
    }
}

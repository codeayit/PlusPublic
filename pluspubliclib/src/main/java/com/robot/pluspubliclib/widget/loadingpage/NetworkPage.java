package com.robot.pluspubliclib.widget.loadingpage;

import android.content.Context;
import android.view.View;

import com.ayti.loadinglayout.BasePage;
import com.ayti.loadinglayout.Utils;
import com.robot.pluspubliclib.R;

/**
 * Created by lny on 2018/2/27.
 */

public class NetworkPage extends BasePage {
    public NetworkPage(Context context) {
        super(context);
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public int pageViewLayoutId() {
        return R.layout.loadinglayout_network;
    }

    @Override
    public View[] getOnReloadViews() {
        return new View[]{Utils.findViewById(getPageView(),R.id.tv_reload),Utils.findViewById(getPageView(),R.id.tv_connectnet)};
    }
}

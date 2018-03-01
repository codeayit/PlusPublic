package com.robot.pluspubliclib.widget.loadingpage;

import android.content.Context;
import android.view.View;

import com.ayti.loadinglayout.BasePage;
import com.robot.plusdesktop.R;
import com.socks.library.KLog;

/**
 * Created by lny on 2018/2/27.
 */

public class NetworkPage extends BasePage {
    public NetworkPage(Context context) {
        super(context);
    }

    @Override
    public void initView(View view) {
        view.findViewById(R.id.tv_connectnet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KLog.d("链接网络");
            }
        });
    }

    @Override
    public int pageViewLayoutId() {
        return R.layout.loadinglayout_network;
    }

    @Override
    public View getOnReloadView() {
        return getOnReloadView();
    }
}

package com.robot.pluspubliclib;

import com.ayti.loadinglayout.BaseLoadingLayout;
import com.robot.baseapi.base.BaseApplication;
import com.robot.baseapi.net.NetWork;
import com.robot.pluspubliclib.widget.loadingpage.EmptyPage;
import com.robot.pluspubliclib.widget.loadingpage.ErrorPage;
import com.robot.pluspubliclib.widget.loadingpage.NetworkPage;

/**
 * Created by lny on 2018/3/1.
 */

public class PublicApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        initLoadingPage();
        iniNetWork();
    }

    private void iniNetWork() {
    }

    /**
     * 设置全局的loadingLayoug 的page
     */
    public void initLoadingPage(){
        BaseLoadingLayout.setGlobalPages(ErrorPage.class, EmptyPage.class, NetworkPage.class);
    }
}

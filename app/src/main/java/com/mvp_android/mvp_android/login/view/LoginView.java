package com.mvp_android.mvp_android.login.view;

import android.content.Intent;

/**
 * 登录界面的View的交互动作接口类
 */
public interface LoginView {
    /**
     * 显示进度条
     */
    void showProgress();

    /**
     * 隐藏进度条
     */
    void hideProgress();

    /**
     * 用户名错误
     */
    void setUsernameError();

    /**
     * 用户密码错误
     */
    void setPasswordError();

    /**
     * 登录成功
     */
    void loginSuccessful();


}
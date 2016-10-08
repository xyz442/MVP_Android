package com.mvp_android.mvp_android.login.presenter;

/**
 * 登陆事件监听
 */
public interface OnLoginFinishedListener {
    /**
     * 用户名错误
     */
    void onUsernameError();

    /**
     * 用户错误或者为空
     */
    void onPasswordError();

    /**
     * 登录成功的回调方法
     */
    void onSuccess();
}
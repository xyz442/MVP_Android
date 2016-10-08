package com.mvp_android.mvp_android.login.model;

import com.mvp_android.mvp_android.login.presenter.OnLoginFinishedListener;

/**
 * 模拟登陆的操作的接口，实现类为LoginModelImpl.相当于MVP模式中的Model层
 */
public interface LoginModel {
    /**
     * 用户登录数据效验接口
     * @param username
     * @param password
     * @param listener
     */
    void login(String username, String password, OnLoginFinishedListener listener);
}

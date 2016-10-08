package com.mvp_android.mvp_android.login.presenter;

/**
 * 登陆的Presenter 的接口，实现类为LoginPresenterImpl，完成登陆的验证，以及销毁当前view
 */
public interface LoginPresenter {
    /**
     * 验证用户名，和密码
     * @param username
     * @param password
     */
    void validateCredentials(String username, String password);

    /**
     * 验证成功，跳转到其他页面并销毁当前View
     */
    void onDestroy();
}
package com.mvp_android.mvp_android.login.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.mvp_android.mvp_android.R;
import com.mvp_android.mvp_android.home.HomeActivity;
import com.mvp_android.mvp_android.login.presenter.LoginPresenter;
import com.mvp_android.mvp_android.login.presenter.impl.LoginPresenterImpl;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class LoginActivity extends AppCompatActivity implements LoginView,View.OnClickListener{

    private ProgressBar progressBar;
    private AutoCompleteTextView username;
    private EditText password;
    private LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        username = (AutoCompleteTextView) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        findViewById(R.id.button).setOnClickListener(this);

        presenter = new LoginPresenterImpl(this);

    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        username.setError(getString(R.string.username_error));
    }

    @Override
    public void setPasswordError() {
        password.setError(getString(R.string.password_error));
    }

    @Override
    public void loginSuccessful() {
        Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
    }



   /* @Override
    public void startActivities(Intent intent) {
        this.startActivities(new Intent(LoginActivity.this, HomeActivity.class));
    }
*/


    @Override
    public void onClick(View view) {
        presenter.validateCredentials(username.getText().toString(), password.getText().toString());
    }
}

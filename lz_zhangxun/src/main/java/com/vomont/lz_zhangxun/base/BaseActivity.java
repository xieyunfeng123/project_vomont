package com.vomont.lz_zhangxun.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.vomont.lz_zhangxun.R;

import java.util.LinkedList;
import java.util.List;

import butterknife.ButterKnife;

public abstract class BaseActivity<T extends BasePresenter>  extends Activity
{

    protected T mPresenter;

    private static Activity mCurrentActivity;// 对所有activity进行管理
    public static List<Activity> mActivities = new LinkedList<Activity>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();

        //初始化的时候将其添加到集合中
        synchronized (mActivities) {
            mActivities.add(this);
        }
        //子类不再需要设置布局ID，也不再需要使用ButterKnife.bind()
        setContentView(provideContentViewId());
        ButterKnife.bind(this);
        initView();
        initData();
        initListener();
    }

    public void initView() {
    }

    public void initData() {
    }

    public void initListener() {
    }

    //用于创建Presenter和判断是否使用MVP模式(由子类实现)
    protected abstract T createPresenter();

    //得到当前界面的布局文件id(由子类实现)
    protected abstract int provideContentViewId();

    @Override
    protected void onResume() {
        super.onResume();
        mCurrentActivity = this;
    }

    @Override
    protected void onPause() {
        super.onPause();
        mCurrentActivity = null;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //销毁的时候从集合中移除
        synchronized (mActivities) {
            mActivities.remove(this);
        }

        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }


    
}

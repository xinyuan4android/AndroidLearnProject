package com.android.learn.fragment;

import android.os.Bundle;

import com.android.learn.R;
import com.android.learn.base.fragment.BaseMvpFragment;
import com.android.learn.base.mpresenter.BasePresenter;


/**
 * @author quchao
 * @date 2018/2/11
 */

public class KnowledgeFragment extends BaseMvpFragment {

    @Override
    public void initData( Bundle bundle) {

    }

    @Override
    public void initView() {

    }

    @Override
    public int setContentLayout() {
        return R.layout.fragment_knowledge;
    }

    @Override
    public void reload() {
    }

    @Override
    public BasePresenter initPresenter() {
        return null;
    }

    @Override
    protected void loadData() {

    }
}

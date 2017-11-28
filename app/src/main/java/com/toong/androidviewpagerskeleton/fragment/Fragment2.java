package com.toong.androidviewpagerskeleton.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.toong.androidviewpagerskeleton.BaseFragment;
import com.toong.androidviewpagerskeleton.R;
import java.util.ArrayList;
import java.util.List;

public class Fragment2 extends BaseFragment {
    private static String TAG = "Fragment2";
    ViewPager mPager;
    PagerAdapter mPagerAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");
        View rootView = inflater.inflate(R.layout.fragment_2, container, false);

        mPager = rootView.findViewById(R.id.pager);
        mPagerAdapter = new PagerAdapter(getChildFragmentManager());

        //        initPager();
        return rootView;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (mPagerAdapter == null) {
            return;
        }
        if (mPagerAdapter.getCount() == 0) {
            initPager();
            return;
        }
        Fragment selectedFragment = mPagerAdapter.getItem(mPager.getCurrentItem());
        if (selectedFragment == null || !selectedFragment.isResumed()) {
            return;
        }
        if (selectedFragment instanceof Fragment2a) {

        }
        if (selectedFragment instanceof Fragment2b) {

        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView");
    }

    /**
     * Test init pager when fragment created or when fragment visible
     */
    private void initPager() {
        mPagerAdapter.addFragment(new Fragment2a());
        mPagerAdapter.addFragment(new Fragment2b());
        mPagerAdapter.addFragment(new Fragment2c());

        mPager.setAdapter(mPagerAdapter);
    }

    private class PagerAdapter extends FragmentStatePagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment) {
            mFragmentList.add(fragment);
        }
    }
}

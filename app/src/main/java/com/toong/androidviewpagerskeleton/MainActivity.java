package com.toong.androidviewpagerskeleton;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.toong.androidviewpagerskeleton.fragment.Fragment1;
import com.toong.androidviewpagerskeleton.fragment.Fragment2;
import com.toong.androidviewpagerskeleton.fragment.Fragment3;
import com.toong.androidviewpagerskeleton.fragment.Fragment4;
import com.toong.androidviewpagerskeleton.fragment.Fragment5;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public ViewPager mPager;

     PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager());

        mPagerAdapter.addFragment(new Fragment1());
        mPagerAdapter.addFragment(new Fragment2());
        mPagerAdapter.addFragment(new Fragment3());
        mPagerAdapter.addFragment(new Fragment4());
        mPagerAdapter.addFragment(new Fragment5());

        mPager.setOffscreenPageLimit(mPagerAdapter.getCount());
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

package com.example.barangel;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.List;

/**
 * Created by mlynch on 12/01/14.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;

    public MyPagerAdapter(FragmentManager supportFragmentManager, List<Fragment> fragments) {
        super(supportFragmentManager);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return String.format("Choose Bar");
            case 1:
                return String.format("Choose Beer");
            case 2:
                return String.format("Review and Pay");
        }
        return String.format("Error");
    }
}

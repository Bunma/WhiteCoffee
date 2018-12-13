package com.example.mrbunma.whitecoffee.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.mrbunma.whitecoffee.FragmentSliderOne;
import com.example.mrbunma.whitecoffee.FragmentSliderThree;
import com.example.mrbunma.whitecoffee.FragmentSliderTwo;

public class CustomViewPagerAdapter extends FragmentStatePagerAdapter {
    public CustomViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment;

        if (i == 0) {
            fragment = new FragmentSliderOne();
        } else if (i == 1) {
            fragment = new FragmentSliderTwo();
        } else {
            fragment = new FragmentSliderThree();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}

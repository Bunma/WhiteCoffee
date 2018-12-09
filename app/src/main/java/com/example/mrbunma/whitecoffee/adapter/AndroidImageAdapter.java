package com.example.mrbunma.whitecoffee.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mrbunma.whitecoffee.R;

public class AndroidImageAdapter extends PagerAdapter {
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }

    Context mContext;

    public AndroidImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    private int[] sliderImageId = new   int[]{
            R.drawable.coffee1,R.drawable.coffee2,R.drawable.coffee3,
            R.drawable.coffee1,R.drawable.coffee2,R.drawable.coffee3
    };

    @Override
    public int getCount() {
        return sliderImageId.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @Override
    public void startUpdate(@NonNull ViewGroup container) {
        super.startUpdate(container);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView mImageView = new ImageView(mContext);
        mImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        mImageView.setImageResource(sliderImageId[position]);
        ((ViewPager) container).addView(mImageView, 0);
        return mImageView;
    }
}

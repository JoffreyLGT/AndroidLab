package fr.joffreylagut.bnv_and_viewpager.utilities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.List;

/**
 * Created by joffrey on 03/05/17.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    private final HashMap<Integer, Fragment> fragments;

    public MainPagerAdapter(FragmentManager fm, HashMap<Integer, Fragment> fragments) {
        super(fm);
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
}

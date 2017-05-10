package fr.joffreylagut.bnv_and_viewpager.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.joffreylagut.bnv_and_viewpager.R;

/**
 * Created by joffrey on 03/05/17.
 */

public class HomeFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View viewRoot = inflater.inflate(R.layout.fragment_home, container, false);
        return viewRoot;
    }
}

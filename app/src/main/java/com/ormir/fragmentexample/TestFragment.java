package com.ormir.fragmentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ori on 15/11/2016.
 */

public class TestFragment extends Fragment {

    public static TestFragment newInstance() { return new TestFragment(); }
    public TestFragment() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.test_fragment, container, false);

        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}

package com.example.base;

import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {

    public abstract void init();
    public abstract void initControl();
    public abstract void myObserve();
}

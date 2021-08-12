package com.example.rathimitra.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adapter.NoticeAdapter;
import com.example.base.BaseFragment;
import com.example.rathimitra.MainActivity;
import com.example.rathimitra.R;

import java.util.ArrayList;
import java.util.List;


public class NoticeFragment extends BaseFragment {
   public static final String TAG = NoticeFragment.class.getName();
   RecyclerView rec_notice;

    public NoticeFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notice, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
        initControl();
        myObserve();
        setDataOnList();
    }



    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void init() {

    }

    @Override
    public void initControl() {

    }

    @Override
    public void myObserve() {

    }

    private void setDataOnList() {
        rec_notice = getView().findViewById(R.id.rec_notice);
        List<String> list  = new ArrayList<>();
        NoticeAdapter noticeAdapter = new NoticeAdapter(getContext(),list);
        LinearLayoutManager lm = new LinearLayoutManager(getContext());
        lm.setOrientation(RecyclerView.VERTICAL);
        rec_notice.setLayoutManager(lm);
        rec_notice.setAdapter(noticeAdapter);
    }
}
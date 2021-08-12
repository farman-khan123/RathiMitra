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

import com.example.adapter.ManageLeadsAdapter;
import com.example.adapter.NoticeAdapter;
import com.example.base.BaseFragment;
import com.example.rathimitra.R;

import java.util.ArrayList;
import java.util.List;


public class ManageLeadsFragment extends BaseFragment {

    public static final String TAG = ManageLeadsFragment.class.getName();
    RecyclerView rec_mamange_leads;

    public ManageLeadsFragment() {
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
        return inflater.inflate(R.layout.fragment_manage_leads, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
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
        rec_mamange_leads = getView().findViewById(R.id.rec_mamange_leads);
        List<String> list  = new ArrayList<>();
        ManageLeadsAdapter noticeAdapter = new ManageLeadsAdapter(getContext(),list);
        LinearLayoutManager lm = new LinearLayoutManager(getContext());
        lm.setOrientation(RecyclerView.VERTICAL);
        rec_mamange_leads.setLayoutManager(lm);
        rec_mamange_leads.setAdapter(noticeAdapter);
    }
}
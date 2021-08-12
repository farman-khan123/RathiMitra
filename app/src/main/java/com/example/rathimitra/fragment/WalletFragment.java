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
import android.widget.ImageView;

import com.example.adapter.NoticeAdapter;
import com.example.base.BaseFragment;
import com.example.rathimitra.R;

import java.util.ArrayList;
import java.util.List;


public class WalletFragment extends BaseFragment {

    public static final String TAG = WalletFragment.class.getName();
    ImageView wallet_imge;

    public WalletFragment() {
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
        return inflater.inflate(R.layout.fragment_wallet, container, false);
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
        wallet_imge = getView().findViewById(R.id.wallet_imge);
    }

    @Override
    public void initControl() {
        wallet_imge.setOnClickListener(v -> {

        });
    }

    @Override
    public void myObserve() {

    }

    private void setDataOnList() {
    }
}
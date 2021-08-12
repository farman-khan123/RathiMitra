package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rathimitra.R;

import java.util.List;

public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.ViewHolder> {
    Context context;
    List<String> list;


    public NoticeAdapter(Context context,  List<String> list) {
        this.context = context;
        this.list = list;

    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.notice_single_row,null);
        return new ViewHolder (view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title_tv,sub_title_tv,date_tv;
        public ViewHolder(@NonNull View itemView) {
            super (itemView);
            title_tv=itemView.findViewById (R.id.title_tv);
            sub_title_tv=itemView.findViewById (R.id.sub_title_tv);
            date_tv=itemView.findViewById (R.id.date_tv);
        }

    }
}

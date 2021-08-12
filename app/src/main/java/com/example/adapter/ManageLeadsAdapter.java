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

public class ManageLeadsAdapter extends RecyclerView.Adapter<ManageLeadsAdapter.ViewHolder> {
    Context context;
    List<String> list;


    public ManageLeadsAdapter(Context context,  List<String> list) {
        this.context = context;
        this.list = list;

    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.manage_leads_single_row,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView user_name_tv,city_name_tv,mobile_num_tv,category_tv,date_tv,status_tv;
        ImageView menu_img;
        public ViewHolder(@NonNull View itemView) {
            super (itemView);
            user_name_tv=itemView.findViewById (R.id.user_name_tv);
            city_name_tv=itemView.findViewById (R.id.city_name_tv);
            mobile_num_tv=itemView.findViewById (R.id.mobile_num_tv);
            category_tv=itemView.findViewById (R.id.category_tv);
            date_tv=itemView.findViewById (R.id.date_tv);
            status_tv=itemView.findViewById (R.id.status_tv);
            menu_img=itemView.findViewById (R.id.menu_img);
        }

    }
}

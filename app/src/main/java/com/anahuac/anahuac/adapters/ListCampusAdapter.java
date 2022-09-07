package com.anahuac.anahuac.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anahuac.anahuac.R;
import com.anahuac.anahuac.models.campus;

import java.util.ArrayList;

public class ListCampusAdapter extends RecyclerView.Adapter<ListCampusAdapter.Viewholder> {

    private ArrayList<campus> data;

    public ListCampusAdapter(ArrayList <campus> data){
        this.data = data;
    }
    @NonNull
    @Override
    public ListCampusAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_campus_item, parent, false);
        return new ListCampusAdapter.Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListCampusAdapter.Viewholder holder, int position) {
    campus campus = data.get(position);
    holder.tvCampusName.setText(campus.getName());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        private TextView tvCampusName;
        private ImageView ivCampus;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            tvCampusName =itemView.findViewById(R.id.tv_campus_name);
            ivCampus = itemView.findViewById(R.id.iv_campus);

        }
    }
}

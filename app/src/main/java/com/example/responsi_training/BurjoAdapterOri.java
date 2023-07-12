package com.example.responsi_training;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BurjoAdapterOri extends RecyclerView.Adapter<BurjoAdapterOri.BurjoViewHolder> {
    private final LayoutInflater mInflater;
    private List<BurjoModel> burjoModelList;
    private LayoutInflater layoutInflater;
    private Context context;
    final BurjoAdapterOri.OnItemListener listener;

    public BurjoAdapterOri(List<BurjoModel> burjoModelList, Context context, OnItemClickListener listener){
        this.mInflater = LayoutInflater.from(Context);
        this.burjoModelList = burjoModelList;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public BurjoAdapterOri.BurjoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_burjo, null);
        return new BurjoAdapterOri.BurjoViewHolder(View);
    }

    @Override
    public void onBindViewHolder(@NonNull BurjoViewHolder holder, int position){
        holder.bindData(burjoModelList.get(position));
    }
    @Override
    public int getItemCount(){
        return burjoModelList.size();
    }
    public void setItems(List<BurjoModel>items){
        burjoModelList = items;
    }

    private class BurjoViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvHp, tvStatus;
        ImageView ivTakeaway;

        public BurjoViewHolder(@NonNull View itemView) {
            super(itemView);
            ivTakeaway = itemView.findViewById(R.id.ivTakeaway);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvHp = itemView.findViewById(R.id.tvHp);
            tvStatus = itemView.findViewById(R.id.tvStatus);
        }
        public void bindData(final BurjoModel item){
            ivTakeaway.setImageDrawable(item.getKfc());
            tvNama.setText(item.getNama());
            tvHp.setText(item.getHp());
            tvStatus.setText(item.getStatus());
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });

        }

    }
    public Interface OnItemClickListener {
        void onItemClick(BurjoModel item);
    }
}











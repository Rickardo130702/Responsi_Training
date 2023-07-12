package com.example.responsi_training;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

    public class BurjoAdapter extends RecyclerView.Adapter<BurjoAdapter.BurjoViewHolder> {

        private LayoutInflater mInflater; private List<BurjoModel> burjoModelList;
        private LayoutInflater layoutInflater;
        private Context context;
        final BurjoAdapter.OnItemListener listener;
        public BurjoAdapter(List<BurjoModel> burjoModellist , AdapterView.OnItemClickListener listener){
            this.mInflater = LayoutInflater.from(context); this.burjoModelList = burjoModellist;
            this.context = context;
            this.listener = (OnItemListener) listener;

 }
     @NonNull @Override
     public BurjoAdapter.BurjoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BurjoAdapter.BurjoViewHolder(view); }
        View view = mInflater.inflate(R.layout.item_burjo, null);
        @Override
        public void onBindViewHolder(@NonNull BurjoViewHolder holder, int position){ holder.bindData(burjoModelList.get(position)); }
        @Override
        public int getItemCount(){
            return burjoModelList.size(); }
        public void setItems(List<BurjoModel>items){
            burjoModelList = items; }

        public interface OnItemListener { void onItemClick(BurjoModel item);
        }

        public class BurjoViewHolder extends RecyclerView.ViewHolder {
            TextView tvNama, tvHp, tvStatus;
            ImageView ivTakeaway;

            public BurjoViewHolder(@NonNull View itemView) {
                super(itemView);
                tvNama = itemView.findViewById(R.id.tvNama);
                tvHp = itemView.findViewById(R.id.tvHp);
                tvStatus = itemView.findViewById(R.id.tvStatus);
                ivTakeaway = itemView.findViewById(R.id.ivTakeaway);

            }

            public void bindData(final BurjoModel item) {
                tvNama.setText(item.getNama());
                tvHp.setText(item.getHp());
                tvStatus.setText(item.getStatus());
                ivTakeaway.setImageDrawable(item.getKfc());
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        listener.onItemClick(item);
                    }
                });


            }
        }
    }













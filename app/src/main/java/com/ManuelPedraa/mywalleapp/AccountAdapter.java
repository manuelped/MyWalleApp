package com.ManuelPedraa.mywalleapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder>{

    public AccountAdapter(ArrayList<Account> dataSet) {
        this.dataSet = dataSet;
    }

    private ArrayList<Account> dataSet;
    @NonNull
    @Override
    public AccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_account_list,parent,false);
        return new ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {
        Account myAccount = dataSet.get(position);
        holder.loadItem(myAccount);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName,tvColor1,tvIconUrl;
        private String tvDescripcion;
        private ImageView ivPrincipal;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_Name);
            tvDescripcion ="";
            tvColor1 = itemView.findViewById(R.id.tv_Color1);
        }

        public void loadItem(Account myAccount) {
            tvName.setText(myAccount.getName());
            tvDescripcion=(String.valueOf(myAccount.getDescripcion()));
            tvColor1.setText(myAccount.getColor1());
        }
    }
}

package com.ManuelPedraa.mywalleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();
    private RecyclerView rvListAccount;
    private Button desc;
    private Button mas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        desc = findViewById(R.id.btndesc);
        mas = findViewById(R.id.btnmas);
        setContentView(R.layout.activity_list_account);
        loadFakeData();
        rvListAccount = findViewById(R.id.rv_account);
        AccountAdapter myAdaptader = new AccountAdapter(listAccountRV);
        rvListAccount.setAdapter(myAdaptader);
        rvListAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));
    }
    private void loadFakeData(){
        Account categoria1 = new Account("Restaurante","Aqui se vende bocachico","red","https://cdn-icons-png.flaticon.com/512/3448/3448609.png");
        Account categoria2 = new Account("Gasolina","Aqui se vende gasolina","green","https://cdn-icons-png.flaticon.com/512/6352/6352741.png");
        Account categoria3 = new Account("Arriendo","Aqui se vende techo","blue","https://cdn-icons-png.flaticon.com/512/25/25694.png");
        listAccountRV.add(categoria1);
        listAccountRV.add(categoria2);
        listAccountRV.add(categoria3);


    }

}
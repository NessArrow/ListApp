package com.proizvodstvo.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ListItem> data = new ArrayList<>();
        data.add(ListItem.generateListItem());
        data.add(ListItem.generateListItem());
        data.add(ListItem.generateListItem());
        LayoutInflater inflater = LayoutInflater.from(this);

        UsersAdapter adapter = new UsersAdapter(data, inflater);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        Button addBtn = findViewById(R.id.add_btn);
        Button delBtn = findViewById(R.id.del_btn);
        Button clearBtn = findViewById(R.id.clear_btn);

        addBtn.setOnClickListener(view -> {
            data.add(ListItem.generateListItem());
            adapter.notifyDataSetChanged();
        });
        delBtn.setOnClickListener(view -> {
            if (data.size() > 0) {
                data.remove(data.size() - 1);
                adapter.notifyDataSetChanged();
            }
        });
        clearBtn.setOnClickListener(view -> {
            data.clear();
            adapter.notifyDataSetChanged();
        });

    }
}
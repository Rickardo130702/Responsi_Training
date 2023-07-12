package com.example.responsi_training;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BurjoActivity extends AppCompatActivity {

    List<BurjoModel> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burjo);

        addData();
    }
    private void addData() {
        elements = new ArrayList<>();
        elements.add(new BurjoModel("#78C1F3","Burjo Borneo","081234567890","Aktif",R.drawable.take_away));
        elements.add(new BurjoModel("9BE8D8","Burjo Dajal","08987123987123","Nonaktif",R.drawable.steak));
        elements.add(new BurjoModel("E2F6CA","Burjo Manusia","089712345637","Aktif",R.drawable.bbq));

        BurjoAdapter adapter = new BurjoAdapter(elements, this, BurjoAdapter.OnItemListener()){

        };

    }
}
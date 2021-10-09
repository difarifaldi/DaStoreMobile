package com.example.dastore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class about extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        ImageSlider imageSlider = findViewById(R.id.foodo1);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://www.chiquelle.no/pub_images/original/x045-25jan2021.JPG?timestamp=1611683010","Sweater"));
        slideModels.add(new SlideModel("https://static.e-stradivarius.net/5/photos3/2019/I/0/1/p/6591/441/210/6591441210_1_1_3.jpg","Top"));
        slideModels.add(new SlideModel("https://5.imimg.com/data5/XY/NN/MY-10440339/ladies-ripped-jeans-500x500.jpg","Jeans"));
        slideModels.add(new SlideModel("https://id-test-11.slatic.net/p/57dd23935789d075b90b216735f5b312.jpg","Bag"));

        imageSlider.setImageList(slideModels,true);

        findViewById(R.id.pencet1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),about1.class));
            }
        });
        findViewById(R.id.pencet2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),about2.class));
            }
        });
    }
}

package com.example.mydatabinding.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mydatabinding.R;
import com.example.mydatabinding.databinding.ActivityDemo3Binding;

public class Demo3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDemo3Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_demo3);
    }
}

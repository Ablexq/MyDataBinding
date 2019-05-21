package com.example.mydatabinding.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mydatabinding.R;
import com.example.mydatabinding.databinding.ActivityDemo3Binding;
import com.example.mydatabinding.model.User;

public class Demo3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDemo3Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_demo3);
        binding.setUser(new User(null, "xyz"));
        binding.setUser1(new com.example.mydatabinding.model1.User("abc111", "xyz111"));
    }
}

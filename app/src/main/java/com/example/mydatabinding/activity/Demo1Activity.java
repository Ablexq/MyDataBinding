package com.example.mydatabinding.activity;

import android.os.Bundle;

import com.example.mydatabinding.R;
import com.example.mydatabinding.databinding.ActivityDemo1Binding;
import com.example.mydatabinding.model.Person;
import com.example.mydatabinding.model.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;


public class Demo1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);

        ActivityDemo1Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_demo1);
        binding.setUser(new User("xq", "666"));
        binding.setPerson(new Person("xq2", 16));
    }
}

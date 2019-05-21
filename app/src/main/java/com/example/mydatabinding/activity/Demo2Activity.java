package com.example.mydatabinding.activity;

import android.os.Bundle;

import com.example.mydatabinding.R;
import com.example.mydatabinding.databinding.ActivityDemo2Binding;
import com.example.mydatabinding.model.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class Demo2Activity extends AppCompatActivity {
    private User user = new User("xq", "大牛");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDemo2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_demo2);
        binding.tv1.setText(user.getFirstName());
        binding.tv2.setText(user.getLastName());
    }
}

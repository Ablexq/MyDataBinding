package com.example.mydatabinding.activity;

import android.os.Bundle;

import com.example.mydatabinding.R;
import com.example.mydatabinding.databinding.ActivityDemo3Binding;
import com.example.mydatabinding.databinding.ActivityDemo4Binding;
import com.example.mydatabinding.model.ObservableUser;
import com.example.mydatabinding.model.PlainUser;
import com.example.mydatabinding.model.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public class Demo4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDemo4Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_demo4);
        PlainUser plainUser = new PlainUser();
        binding.setPlainUser(plainUser);

        ObservableUser observableUser = new ObservableUser();
        binding.setObservableUser(observableUser);
    }
}

package com.example.mydatabinding.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mydatabinding.BR;
import com.example.mydatabinding.R;
import com.example.mydatabinding.databinding.ActivityDemo1Binding;
import com.example.mydatabinding.model.Person;
import com.example.mydatabinding.model.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;


public class Demo1Activity extends AppCompatActivity {
    private ActivityDemo1Binding binding;
    private User user = new User("xq", "666");
    private Person person = new Person("xq", 18);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_demo1);

        binding.setUser(user);

//        binding.setPerson(person);
        //等价于:
        binding.setVariable(BR.person, person);

        binding.setPresenter(new Presenter());
    }

    public class Presenter {
        //跟正常回调的参数一致
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            user.setFirstName(s.toString());
            binding.setUser(user);
        }

        public void onClick(View v) {
            Toast.makeText(Demo1Activity.this, "onClick", Toast.LENGTH_LONG).show();
        }

        public boolean onLongClick(View v) {
            Toast.makeText(Demo1Activity.this, "onLongClick", Toast.LENGTH_LONG).show();
            return false;
        }

        //自定义，可传参数
        public void onClickListenerBinding(User user) {
            Toast.makeText(Demo1Activity.this, "onClickListenerBinding" + user.toString(), Toast.LENGTH_LONG).show();
        }

    }
}

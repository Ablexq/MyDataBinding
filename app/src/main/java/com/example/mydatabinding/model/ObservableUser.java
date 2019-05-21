package com.example.mydatabinding.model;

import com.example.mydatabinding.BR;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;


/*
* BR 是编译阶段生成的一个类，功能与 R.java 类似，
* 用 @Bindable 标记过 getter 方法会在 BR 中生成一个 entry。
*
* 通过代码可以看出，当数据发生变化时还是需要手动发出通知。
* 通过调用 notifyPropertyChanged(BR.firstName) 可以通知系统 BR.firstName 这个 entry 的数据已经发生变化，需要更新 UI。
* */
public class ObservableUser extends BaseObservable {
//    @Bindable
//    该注解用于双向绑定，需要与 notifyPropertyChanged()方法结合使用
//    该注解用于标记实体类中的get方法或“is”开头的方法,且实体类必须继承 BaseObservable.

    private String firstName;
    private String lastName;

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

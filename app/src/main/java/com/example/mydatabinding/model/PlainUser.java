package com.example.mydatabinding.model;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

/*
* 更细粒度的绑定方式，可以具体到成员变量，这种方式无需继承 BaseObservable，一个简单的 POJO 就可以实现。
*
* 系统为我们提供了所有的 primitive type 所对应的 Observable类，
* 例如 ObservableInt、ObservableFloat、ObservableBoolean 等等，
* 还有一个 ObservableField 对应着 reference type。
* */
public class PlainUser {
    public ObservableField<String> firstName = new ObservableField<>();
    public ObservableField<String> lastName = new ObservableField<>();
    public ObservableInt age = new ObservableInt();
}
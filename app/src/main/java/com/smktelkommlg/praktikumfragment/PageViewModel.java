package com.smktelkommlg.praktikumfragment;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();
    private MutableLiveData<String> mAddress = new MutableLiveData<>();

    public void setName(String name){
        mName.setValue(name);
    }
    public LiveData<String> getName(){
        return mName;
    }

    public void setAddress(String address){
        mAddress.setValue(address);
    }
    public LiveData<String> getAddress(){
        return mAddress;
    }
}

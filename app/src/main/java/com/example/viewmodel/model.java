package com.example.viewmodel;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class model extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();

    public void setName (String name) {
        mName.setValue(name);
    }

    public LiveData<String> getName() {
        return mName;
    }
}
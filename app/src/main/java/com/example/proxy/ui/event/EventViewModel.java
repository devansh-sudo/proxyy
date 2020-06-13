package com.example.proxy.ui.event;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EventViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EventViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Event fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
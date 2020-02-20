package com.example.practicetodomanager.screens.main.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.practicetodomanager.App;
import com.example.practicetodomanager.model.Note;

import java.util.List;

public class MainViewModel extends ViewModel {
    private LiveData<List<Note>> noteLiveData = App.getInstance().getNoteDao().getAllLiveData();

    public  LiveData<List<Note>> getNoteLiveData(){
        return noteLiveData;
    }
}

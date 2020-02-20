package com.example.practicetodomanager;

import android.app.Application;

import androidx.room.Room;

import com.example.practicetodomanager.data.AppDatabase;
import com.example.practicetodomanager.data.NoteDao;

public class App extends Application {
    private AppDatabase database;
    private NoteDao noteDao;

    public static  App instance;

    public static  App getInstance(){

        return instance;
    }
    @Override
    public  void  onCreate(){
        super.onCreate();

        instance = this;

        database= Room.databaseBuilder(getApplicationContext(),
            AppDatabase.class,  "app-db-name")
                .allowMainThreadQueries()
                .build();


        noteDao = database.noteDao();
    }



    public AppDatabase getDatabase() {
        return database;
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }
}

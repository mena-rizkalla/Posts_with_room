package com.example.postswithroom;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.postswithroom.model.Post;

@Database(entities = Post.class,version = 1)
public abstract class PostsDatabase extends RoomDatabase {

    private static PostsDatabase INSTANCE;
    public abstract PostsDao postsDao();

    public static synchronized PostsDatabase getINSTANCE(Context context){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),PostsDatabase.class,"posts_databse")
                    .fallbackToDestructiveMigration().build();
        }
        return INSTANCE;
    }

}

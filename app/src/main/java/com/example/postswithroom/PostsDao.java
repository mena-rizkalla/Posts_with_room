package com.example.postswithroom;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


import com.example.postswithroom.model.Post;

import java.util.List;
import java.util.Observable;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface PostsDao {

    @Insert
    Completable insertPost(Post post);

    @Query("SELECT * FROM posts_table")
    Single<List<Post>> getPosts();


}

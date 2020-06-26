package com.trabalho.loginmysql.Database;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.trabalho.loginmysql.Model.User;


@Database(entities = {User.class}, version = 1, exportSchema = false)

public abstract class UserDatabase extends RoomDatabase {

    public abstract UserDao getUserDao();

}
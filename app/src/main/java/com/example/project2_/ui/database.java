package com.example.project2_.ui;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {
    private static final String  dbname = "custom_orders";
    public database(@Nullable Context context) {
        super(context,  dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String q = "create table users (_id integer primary key autoincrement , name text , Items text, quantities text)";
        db.execSQL(q);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists users");
        onCreate(db);
    }

    public boolean insert_data(String name , String Items ,String quantities){
        SQLiteDatabase dg = this.getWritableDatabase();
        ContentValues c = new ContentValues();
        c.put("name", name);
        c.put("Items", Items);
        c.put("quantities", quantities);
        long r = dg.insert("users",null,c);
        if (r==-1) return false;
        else {
            return true;
        }
    }
}

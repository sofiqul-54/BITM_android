package com.sofiqul54.sqliteinsert;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static String DATABASE_NAME = "User.db";
    private static String TABLE_NAME = "User";
    private static String COL_ID = "Id";
    private static String COL_NAME = "Name";
    private static String COL_AGE = "Age";
    private static int VERSION = 1;
    private String CREATE_TABLE = "create table "+TABLE_NAME+" (Id INTEGER PRIMARY KEY, NAME TEXT, Age TEXT)";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public long insertDate(String name, String age){
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_NAME, name);
        contentValues.put(COL_AGE, age);
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
        long id = sqLiteDatabase.insert(TABLE_NAME, null, contentValues);
        sqLiteDatabase.close();
        return id;
    }
}

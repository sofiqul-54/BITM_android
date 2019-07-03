package com.sofiqul54.sqliteinsert;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class DatadeatailsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Cursor cursor;
    private DatabaseHelper databaseHelper;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datadeatails);

        init();

while (cursor.moveToNext()){
    int id = cursor.getInt(cursor.getColumnIndex(databaseHelper.COL_ID));
    int name = cursor.getInt(cursor.getColumnIndex(databaseHelper.COL_NAME));
    int age = cursor.getInt(cursor.getColumnIndex(databaseHelper.COL_AGE));

    user.add(new User(id,name,age));
}
    }

    private void init() {


    }
}

package com.example.btl_foodapp_2_7.Project.Database;

import static com.example.btl_foodapp_2_7.Project.Database.DatabaseHelper.MyContract.TABLE_NAME;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;


import com.example.btl_foodapp_2_7.Project.Database.DatabaseHelper;
import com.example.btl_foodapp_2_7.Project.Model.Category;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class MyDAO {
    private static SQLiteDatabase database;
    private static DatabaseHelper dbHelper;

    public MyDAO(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public long insertData(String name, String email) {
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.MyContract.COLUMN_NAME, name);
        values.put(DatabaseHelper.MyContract.COLUMN_IMAGE, email);

        return database.insert(TABLE_NAME, null, values);
    }

    public Cursor getCategory(){
        String[] projection = {
                DatabaseHelper.MyContract.COLUMN_NAME,
                DatabaseHelper.MyContract.COLUMN_IMAGE
        };
        return database.query(
                TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null
        );
    }



    public Cursor getAllData() {
        String[] projection = {
                DatabaseHelper.MyContract.COLUMN_ID,
                DatabaseHelper.MyContract.COLUMN_NAME,
                DatabaseHelper.MyContract.COLUMN_IMAGE
        };

        return database.query(
                TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null
        );
    }


}


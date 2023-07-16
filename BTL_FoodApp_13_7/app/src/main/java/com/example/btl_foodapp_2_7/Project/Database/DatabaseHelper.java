package com.example.btl_foodapp_2_7.Project.Database;

import static com.example.btl_foodapp_2_7.Project.Database.DatabaseHelper.MyContract.COLUMN_IMAGE;
import static com.example.btl_foodapp_2_7.Project.Database.DatabaseHelper.MyContract.COLUMN_NAME;
import static com.example.btl_foodapp_2_7.Project.Database.DatabaseHelper.MyContract.TABLE_NAME;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public class MyContract {
        public static final String TABLE_NAME = "my_table";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_IMAGE = "image";
    }


    private static final String DATABASE_NAME = "my_database.db";
    private static final int DATABASE_VERSION = 1;

    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    MyContract.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_NAME + " TEXT, " +
                    MyContract.COLUMN_IMAGE + " INTEGER)";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_TABLE);
        addCategory(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Thực hiện các thay đổi cấu trúc của cơ sở dữ liệu (nếu có) khi phiên bản thay đổi
    }

    private void addCategory(SQLiteDatabase db) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, "John Doe");
        values.put(COLUMN_IMAGE, 1);
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_NAME, "Jane Smith");
        values.put(COLUMN_IMAGE, 2);
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_NAME, "John Doe");
        values.put(COLUMN_IMAGE, 1);
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_NAME, "Jane Smith");
        values.put(COLUMN_IMAGE, 2);
        db.insert(TABLE_NAME, null, values);

    }

}



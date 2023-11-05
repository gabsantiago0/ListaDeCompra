package com.example.listadecompra.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class SQLiteOpenHelper extends android.database.sqlite.SQLiteOpenHelper {

    private static final String DATABASE_NAME = "supermarket.db";
    private static final int DATABASE_VERSION = 1;
    public static final String TABLE_PRODUCTS = "products";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_AMOUNT = "amount";
    public static final String COLUMN_PRICE = "price";

    private static String TABLE_CREATE =
            "CREATE TABLE " + TABLE_PRODUCTS + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_DESCRIPTION + " TEXT, " +
                    COLUMN_AMOUNT + " INTEGER, " +
                    COLUMN_PRICE + " REAL);";

    public SQLiteOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUCTS);
        onCreate(db);
    }
}

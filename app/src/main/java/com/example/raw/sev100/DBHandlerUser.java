package com.example.raw.sev100;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dennisdarwis on 28/5/17.
 */

public class DBHandlerUser extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "user",
    TABLE_USER = "users",
    KEY_USERID = "id",
    KEY_USERNAME = "userName",
    KEY_USERPASS = "userPass",
    KEY_EMAIL = "email";

    public DBHandlerUser(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_USER+"("+KEY_USERID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                KEY_USERNAME+" TEXT,"+KEY_USERPASS+" TEXT,"+KEY_EMAIL+" TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_USER);
    }
}

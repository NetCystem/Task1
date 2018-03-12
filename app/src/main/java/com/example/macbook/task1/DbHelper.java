package com.example.macbook.task1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DbHelper extends SQLiteOpenHelper {

    private static final String Dbname = "myDb";
    private String Table_name = "Java";
    private String picURL;


    public DbHelper(Context context) {
        super(context, Dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table Java (Id Integer Primary Key Autoincrement," + "Name VarChar (15) Not Null, Age TEXT Not Null)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop Table If Exists JAVA" );

    }


    public Cursor getDates(){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery ("select * from Java", null);
        return cursor;
    }


    public boolean myUpdate(String id, String url){
        SQLiteDatabase sqLiteDatabase  = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(picURL, url);
        int j = sqLiteDatabase.update(Table_name, contentValues, "ID=?", new String[]{id});


        if (j==-1){

            return false;
        }else {
            return true;
        }
    }
}

package DAO;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import Database.DatabaseOpenHelper;
import Domain.Categories;

public class CategoriesDAO {
    DatabaseOpenHelper databaseOpenHelper;
    SQLiteDatabase sqLiteDatabase;

    public CategoriesDAO(Context context) {
        databaseOpenHelper = new DatabaseOpenHelper(context);
    }

    public void open() {
        sqLiteDatabase = databaseOpenHelper.getReadableDatabase();
    }

    public void close() {
        databaseOpenHelper.close();
    }
    @SuppressLint("Recycle")

    public List<Categories> getListCategories() {
        List<Categories> categories = new ArrayList<>();
        Cursor cursor= sqLiteDatabase.rawQuery(" select * from LOAIMONAN " ,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            int id= cursor.getInt(0);
            String title=cursor.getString(1);
            String img= cursor.getString(2);
            if(id !=0){
                categories.add(new Categories(id, title,img));
            }
            cursor.moveToNext();
        }
        cursor.close();
        return categories;
    }
}

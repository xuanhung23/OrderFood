package Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseAccess {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    private static DatabaseAccess instance;

    public DatabaseAccess(Context context) {
        this.openHelper = openHelper;
    }

    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    public void open() {
        this.db = openHelper.getWritableDatabase();
    }

    public void close() {
        if (db != null) {
            db.close();
        }
    }




}

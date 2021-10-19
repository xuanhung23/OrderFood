package Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class CreateDatabase extends SQLiteOpenHelper {
    public static String DB_NAME = "ORDERFOOD.db";
    public static final String DB_MONAN = "MONAN";
    public static String DB_LOAIMONAN = "LOAIMONAN";
    public static String DB_CHITIETGOIMON = "CHITIETGOIMON";
    public static String DB_BANAN = "BANAN";
    public static String DB_GOIMON = "GOIMON";
    public static String DB_NHANVIEN = "NHANVIEN";
    public static String DB_QUYEN = "QUYEN";

    public static String DB_MONAN_MAMON = "MAMON";
    public static String DB_MONAN_TENMONAN = "TENMONAN";
    public static String DB_MONAN_GIATIEN = "GIATIEN";
    public static String DB_MONAN_HINHANH = "HINHANH";
    public static String DB_MONAN_MALOAI = "MALOAI";

    public static String DB_LOAIMONAN_MALOAI = "MALOAI";
    public static String DB_LOAIMONAN_TENLOAI = "TENLOAI";

    public static String DB_CHITIETGOIMON_MAGOIMON = "MAGOIMON";
    public static String DB_CHITIETGOIMON_MAMONAN = "MAMONAN";
    public static String DB_CHITIETGOIMON_SOLUONG = "SOLUONG";

    public static String DB_BANAN_MABAN = "MABAN";
    public static String DB_BANAN_TENBAN = "TENBAN";
    public static String DB_BANAN_TINHTRANG = "TINHTRANG";

    public static String DB_GOIMON_MAGOIMON = "MAGOIMON";
    public static String DB_GOIMON_MABAN = "MABAN";
    public static String DB_GOIMON_MANV = "MANV";
    public static String DB_GOIMON_NGAYGOI = "NGAYGOI";
    public static String DB_GOIMON_TINHTRANG = "TINHTRANG";


    public static String DB_NHANVIEN_MANV = "MANV";
    public static String DB_NHANVIEN_TENDN = "TENDN";
    public static String DB_NHANVIEN_GIOITINH = "MATKHAU";
    public static String DB_NHANVIEN_NGAYSINH = "NGAYSINH";
    public static String DB_NHANVIEN_CCCD = "CCCD";
    public static String DB_NHANVIEN_MAQUYEN = "MAQUYEN";

    public static String DB_QUYEN_MAQUYEN = "MAQUYEN";
    public static String DB_QUYEN_TENQUYEN = "TENQUYEN";


    public CreateDatabase(Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tbMONAN = "CREATE TABLE " + DB_MONAN + " ( " + DB_MONAN_MAMON + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + DB_MONAN_TENMONAN + " TEXT," + DB_MONAN_GIATIEN + " INTEGER," + DB_MONAN_HINHANH + " BLOB, " + DB_MONAN_MALOAI + " INTEGER )";

        String tbLOAIMONAN = "CREATE TABLE " + DB_LOAIMONAN + " ( " + DB_LOAIMONAN_MALOAI + " INTEGER PRIMARY KEY AUTOINCREMENT, " + DB_LOAIMONAN_TENLOAI + " TEXT )";


        String tbBANAN = "CREATE TABLE " + DB_BANAN + " ( " + DB_BANAN_MABAN +  " INTEGER PRIMARY KEY AUTOINCREMENT, " + DB_BANAN_TENBAN + " TEXT," + DB_BANAN_TINHTRANG + " TEXT ) ";

        String tbGOIMON = "CREATE TABLE " + DB_GOIMON + " ( " + DB_GOIMON_MAGOIMON + " INTEGER PRIMARY KEY AUTOINCREMENT," + DB_GOIMON_MABAN + " INTEGER, " +
                DB_GOIMON_MANV + " INTEGER, " + DB_GOIMON_NGAYGOI + " TEXT, " + DB_GOIMON_TINHTRANG + " TEXT ) ";

        String tbNHANVIEN = "CREATE TABLE " + DB_NHANVIEN + " ( " + DB_NHANVIEN_MANV + " INTEGER PRIMARY KEY AUTOINCREMENT," + DB_NHANVIEN_TENDN+ " TEXT," +  DB_NHANVIEN_GIOITINH + " TEXT,"
                +  DB_NHANVIEN_NGAYSINH + " TEXT," + DB_NHANVIEN_CCCD+ " TEXT," + DB_NHANVIEN_MAQUYEN + " INTEGER)";

        String tbQUYEN = "CREATE TABLE " + DB_QUYEN  + " ( " + DB_QUYEN_MAQUYEN + " INTEGER PRIMARY KEY AUTOINCREMENT, " +  DB_QUYEN_TENQUYEN + " TEXT )";

        String tbCHITIETGOIMON = "CREATE TABLE " +DB_CHITIETGOIMON + " ( " + DB_CHITIETGOIMON_MAMONAN + " INTEGER, " + DB_CHITIETGOIMON_MAGOIMON + " INTEGER," + DB_CHITIETGOIMON_SOLUONG +
                " INTEGER, "+ " PRIMARY KEY ( "+ DB_CHITIETGOIMON_MAMONAN + ","+DB_CHITIETGOIMON_MAGOIMON + " )) ";

        db.execSQL(tbMONAN);
        db.execSQL(tbCHITIETGOIMON);
        db.execSQL(tbGOIMON);
        db.execSQL(tbBANAN);
        db.execSQL(tbLOAIMONAN);
        db.execSQL(tbNHANVIEN);
        db.execSQL(tbQUYEN);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            db.execSQL("drop table if exists " + DB_NAME);
            onCreate(db);
        }

    }


}

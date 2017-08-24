package com.vomont.lz_zhangxun.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    //类没有实例化,是不能用作父类构造器的参数,必须声明为静态

    private static final String name = "yundd"; //数据库名称

    private static final int version = 1; //数据库版本

    public  static final String db_user="user";


    public static DatabaseHelper databaseHelper;

    public static DatabaseHelper getInstance(Context context)
    {
        if (databaseHelper == null)
            databaseHelper = new DatabaseHelper(context);
        return databaseHelper;
    }


    public DatabaseHelper(Context context) {
        //第三个参数CursorFactory指定在执行查询时获得一个游标实例的工厂类,设置为null,代表使用系统默认的工厂类
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //id 自增長的不談  name 用户名  password 密码 accountid 用户id
        db.execSQL("create table if not exists "+db_user+" ( id integer primary key autoincrement,name varchar(20),password varchar(20),accountid integer" );
//        db.execSQL("CREATE TABLE IF NOT EXISTS person (personid integer primary key autoincrement, name varchar(20), age INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("ALTER TABLE person ADD phone VARCHAR(12)"); //往表中增加一列
    }
}
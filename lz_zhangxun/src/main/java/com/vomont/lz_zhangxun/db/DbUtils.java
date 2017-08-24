package com.vomont.lz_zhangxun.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class DbUtils {

    DatabaseHelper helper;

    SQLiteDatabase db;
    public  DbUtils(Context context)
    {
        helper=DatabaseHelper.getInstance(context);
        db = helper.getWritableDatabase();
    }

    /**
     *  添加用户
     * @param name  用户名
     * @param password 密码
     * @param accountid 用户id
     */
    public  void addUser(String  name,String  password,int accountid)
    {
        db.execSQL("INSERT INTO " + DatabaseHelper.db_user + " VALUES (NULL,?,?,?)",
                new Object[] {name,password,accountid});
    }

    /**
     * 修改密码 （用户名和用户id是固定不变的）
     * @param password 用户新密码
     */
    public  void  upDataUser(String  password)
    {
        ContentValues values = new ContentValues();
        values.put("ispack", 1);// key为字段名，value为值
        db.update( DatabaseHelper.db_user, values, "name=?", new String[] {password});
        /////
    }

}

package com.vomont.lz_zhangxun.bean;

import java.io.Serializable;

public class IPInfo implements Serializable
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    //上传文件的ip
    private String vfilesvrip;
    //上传文件的端口
    private String vfilesvrport;
    
    public String getVfilesvrip()
    {
        return vfilesvrip;
    }
    
    public void setVfilesvrip(String vfilesvrip)
    {
        this.vfilesvrip = vfilesvrip;
    }
    
    public String getVfilesvrport()
    {
        return vfilesvrport;
    }
    
    public void setVfilesvrport(String vfilesvrport)
    {
        this.vfilesvrport = vfilesvrport;
    }
    
}

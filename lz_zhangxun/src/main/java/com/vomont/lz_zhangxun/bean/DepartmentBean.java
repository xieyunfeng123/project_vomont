package com.vomont.lz_zhangxun.bean;

import java.io.Serializable;

public class DepartmentBean implements Serializable
{
    public int getDepartmentlevel()
    {
        return departmentlevel;
    }

    public void setDepartmentlevel(int departmentlevel)
    {
        this.departmentlevel = departmentlevel;
    }

    public int getDepartmentprivilege()
    {
        return departmentprivilege;
    }

    public void setDepartmentprivilege(int departmentprivilege)
    {
        this.departmentprivilege = departmentprivilege;
    }

    public String getSortLetters()
    {
        return sortLetters;
    }

    public void setSortLetters(String sortLetters)
    {
        this.sortLetters = sortLetters;
    }

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    public int getDepartmentid()
    {
        return departmentid;
    }

    public void setDepartmentid(int departmentid)
    {
        this.departmentid = departmentid;
    }

    public int getDepartmentownerid()
    {
        return departmentownerid;
    }

    public void setDepartmentownerid(int departmentownerid)
    {
        this.departmentownerid = departmentownerid;
    }

    public String getDepartmentname()
    {
        return departmentname;
    }

    public void setDepartmentname(String departmentname)
    {
        this.departmentname = departmentname;
    }

    //上层组织的id 如果没有上层组织 那id就是0
    private int departmentid;
    
    private int departmentownerid;
    
    private String departmentname;
    
    private String sortLetters;
    
    private  int departmentlevel;
    
    private int departmentprivilege;

    
    
}

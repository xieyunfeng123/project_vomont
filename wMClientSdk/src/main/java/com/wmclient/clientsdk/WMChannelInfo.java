package com.wmclient.clientsdk;

import java.io.Serializable;

public class WMChannelInfo implements Serializable
{
    private int channelId;
    private String channelName;
    private int channelPrivilege;
   
	/**
	*��ȡͨ��Id���
	*@return ͨ��Id���
    */    
    public int getChannelId() 
    {
        return channelId;
    }

	/**
	*����ͨ��Id���
	*@param channelId ͨ��Id���
    */     
    public void setChannelId(int channelId) 
    {
        this.channelId = channelId;
    }
 
	/**
	*��ȡͨ������
	*@return ͨ������
    */     
    public String getChannelName() 
    {
        return channelName;
    }

	/**
	*����ͨ������
	*@param channelName ͨ������
    */      
    public void setChannelName(String channelName) 
    {
        this.channelName = channelName;
    }    

	/**
	*��ȡͨ������Ȩ��
	*@return ͨ������Ȩ��
    */      
    public int getChannelPrivilege() 
    {
        return channelPrivilege;
    }

	/**
	*����ͨ������Ȩ��
	*@param channelPrivilege ͨ������Ȩ��
    */    
    public void setChannelPrivilege(int channelPrivilege) 
    {
        this.channelPrivilege = channelPrivilege;
    }
}

package com.vomont.lz_zhangxun.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.annotation.SuppressLint;
import com.vomont.lz_zhangxun.bean.DepartmentBean;

public class PrivilegeChecker
{
    // 1.图片上传和管理 2.视频上传 3.验证码登录 4.自动更新
    //  5.热键 6.离线 7.視頻分辨率 8.4g和wifi的切换权限
    private static Map<Integer, DepartmentBean> depMap;
    
    private static DepartmentBean m_selfDep;
    
    public static int LZTLJDepLevel_LuJu = 1;
    
    public static int LZTLJDepLevel_ZhanDuan = 2;
    
    public static int LZTLJDepLevel_CheJian = 3;
    
    public static int LZTLJDepLevel_BanZu = 4;
    
    public static int WMFunctionPrivilege_Talk = 1;
    
    public static int WMFunctionPrivilege_LiveVideo = 2;
    
    public static int WMFunctionPrivilege_VideoBackPlay = 4;
    
    @SuppressLint("UseSparseArrays")
    public static boolean SetConfig(int nSelfDepId, List<DepartmentBean> depArr)
    {
        // this.depArr = depArr;
        
        depMap = new HashMap<Integer, DepartmentBean>();
        for (DepartmentBean depPrivilege : depArr)
        {
            depMap.put(depPrivilege.getDepartmentid(), depPrivilege);
        }
        m_selfDep = depMap.get(nSelfDepId);
        if (m_selfDep != null)
        {
            return true;
        }
        
        return false;
    }
    
    public static int getPrivilegeVal(int nPeerDepId)
    {
        boolean bHasTalk = false;
        boolean bHasLiveVideo = false;
        boolean bHasBackPlay = false;
        int nPrivilegeVal = 0;
        DepartmentBean peerDep = null;
        
        DepartmentBean parentDep = null;
        
        peerDep = depMap.get(nPeerDepId);
        parentDep = depMap.get(nPeerDepId);
        if (peerDep == null || !depMap.containsValue(peerDep))
        {
            return nPrivilegeVal;
        }
        
        if (LZTLJDepLevel_BanZu == m_selfDep.getDepartmentlevel() && LZTLJDepLevel_BanZu == peerDep.getDepartmentlevel() && m_selfDep.getDepartmentownerid() == peerDep.getDepartmentownerid())
        {
            bHasTalk = true;
        }
        else if (LZTLJDepLevel_BanZu == m_selfDep.getDepartmentlevel() && LZTLJDepLevel_CheJian == peerDep.getDepartmentlevel() && m_selfDep.getDepartmentownerid() == peerDep.getDepartmentid())
        {
            bHasTalk = true;
        }
        else if (LZTLJDepLevel_BanZu == m_selfDep.getDepartmentlevel() && LZTLJDepLevel_ZhanDuan == peerDep.getDepartmentlevel())
        {
            // check self parent's parent
            parentDep = depMap.get(m_selfDep.getDepartmentownerid());
            if (parentDep != null && parentDep.getDepartmentownerid() == peerDep.getDepartmentid())
            {
                bHasTalk = true;
            }
        }
        else if (LZTLJDepLevel_BanZu == m_selfDep.getDepartmentlevel() && LZTLJDepLevel_LuJu == peerDep.getDepartmentlevel())
        {
            // check self parent's parent
            parentDep = depMap.get(m_selfDep.getDepartmentownerid());
            if (parentDep != null)
            {
                int nZhanDuanDepId = parentDep.getDepartmentownerid();
                
                // check selft parent's's parent
                parentDep = depMap.get(nZhanDuanDepId);
                if (parentDep != null && parentDep.getDepartmentownerid() == peerDep.getDepartmentid())
                {
                    bHasTalk = true;
                }
            }
        }
        else if (LZTLJDepLevel_CheJian == m_selfDep.getDepartmentlevel() && LZTLJDepLevel_BanZu == peerDep.getDepartmentlevel() && peerDep.getDepartmentownerid() == m_selfDep.getDepartmentid())
        {
            bHasTalk = true;
        }
        
        else if (LZTLJDepLevel_CheJian == m_selfDep.getDepartmentlevel() && LZTLJDepLevel_CheJian == peerDep.getDepartmentlevel() && m_selfDep.getDepartmentownerid() == peerDep.getDepartmentownerid())
        {
            bHasTalk = true;
        }
        else if (LZTLJDepLevel_CheJian == m_selfDep.getDepartmentlevel() && LZTLJDepLevel_ZhanDuan == peerDep.getDepartmentlevel() && m_selfDep.getDepartmentownerid() == peerDep.getDepartmentid())
        {
            bHasTalk = true;
        }
        else if (LZTLJDepLevel_CheJian == m_selfDep.getDepartmentlevel() && LZTLJDepLevel_LuJu == peerDep.getDepartmentlevel())
        {
            // check self parent's parent
            parentDep = depMap.get(m_selfDep.getDepartmentownerid());
            if (parentDep != null && parentDep.getDepartmentownerid() == peerDep.getDepartmentid())
            {
                bHasTalk = true;
            }
        }
        else if (LZTLJDepLevel_ZhanDuan == m_selfDep.getDepartmentlevel() && LZTLJDepLevel_BanZu == peerDep.getDepartmentlevel())
        {
            // check parent's parent
            parentDep = depMap.get(peerDep.getDepartmentownerid());
            if (parentDep != null && parentDep.getDepartmentownerid() == m_selfDep.getDepartmentid())
            {
                bHasTalk = true;
            }
        }
        else if (LZTLJDepLevel_ZhanDuan == m_selfDep.getDepartmentlevel() && LZTLJDepLevel_CheJian == peerDep.getDepartmentlevel() && peerDep.getDepartmentownerid() == m_selfDep.getDepartmentid())
        {
            bHasTalk = true;
        }
        else if (LZTLJDepLevel_ZhanDuan == m_selfDep.getDepartmentlevel() && peerDep.getDepartmentid() == m_selfDep.getDepartmentid())
        {
            bHasTalk = true;
        }
        else if (LZTLJDepLevel_ZhanDuan == m_selfDep.getDepartmentlevel() && LZTLJDepLevel_LuJu == peerDep.getDepartmentlevel() && m_selfDep.getDepartmentownerid() == peerDep.getDepartmentid())
        {
            bHasTalk = true;
        }
        else if (LZTLJDepLevel_LuJu == m_selfDep.getDepartmentlevel())
        {
            bHasTalk = true;
        }
        //
        // //---------------------------------------------------------------------------------------//
        //
        // //LiveVideo && VideoBackPlay
        if (LZTLJDepLevel_BanZu == m_selfDep.getDepartmentlevel() && nPeerDepId == m_selfDep.getDepartmentid())
        {
            bHasBackPlay = true;
        }
        else if (LZTLJDepLevel_CheJian == m_selfDep.getDepartmentlevel() && peerDep.getDepartmentownerid() == m_selfDep.getDepartmentid())
        {
            bHasBackPlay = true;
            bHasLiveVideo = true;
        }
        else if (LZTLJDepLevel_ZhanDuan == m_selfDep.getDepartmentlevel() && LZTLJDepLevel_CheJian == peerDep.getDepartmentlevel() && peerDep.getDepartmentownerid() == m_selfDep.getDepartmentid())
        {
            bHasBackPlay = true;
            bHasLiveVideo = true;
        }
        else if (LZTLJDepLevel_ZhanDuan == m_selfDep.getDepartmentlevel() && LZTLJDepLevel_BanZu == peerDep.getDepartmentlevel())
        {
            // check parent's parent
            parentDep = depMap.get(peerDep.getDepartmentownerid());
            if (parentDep != null && parentDep.getDepartmentownerid() == m_selfDep.getDepartmentid())
            {
                bHasBackPlay = true;
                bHasLiveVideo = true;
            }
        }
        else if (LZTLJDepLevel_LuJu == m_selfDep.getDepartmentlevel())
        {
            bHasBackPlay = true;
            bHasLiveVideo = true;
        }
        
        // //get value
        nPrivilegeVal += (bHasTalk ? WMFunctionPrivilege_Talk : 0);
        nPrivilegeVal += (bHasLiveVideo ? WMFunctionPrivilege_LiveVideo : 0);
        nPrivilegeVal += (bHasBackPlay ? WMFunctionPrivilege_VideoBackPlay : 0);
        //
        return nPrivilegeVal;
    }
    
    public static boolean HasTalkPrivilege(int nPrivilegeVal)
    {
        return (nPrivilegeVal & WMFunctionPrivilege_Talk) == 0 ? false : true;
    }
    
    public static boolean HasLiveVideoPrivilege(int nPrivilegeVal)
    {
        return (nPrivilegeVal & WMFunctionPrivilege_LiveVideo) == 0 ? false : true;
    }
    
    public static boolean HasVideoBackPlayPrivilege(int nPrivilegeVal)
    {
        return (nPrivilegeVal & WMFunctionPrivilege_VideoBackPlay) == 0 ? false : true;
    }
}

package com.robert.schoolMgr.dao;

import com.robert.schoolMgr.bean.UserInfo;

/**
 * @auth mengjianzhou
 * @Date 2017/10/28
 */
public interface UserMapper {

    UserInfo selectUserInfo(Integer id);

}

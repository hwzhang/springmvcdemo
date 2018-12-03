package com.studyspringmvcboot.dao;

import com.studyspringmvcboot.vo.User;

import java.util.List;

/**
 * 功能描述：
 *
 * @author 张宏伟
 * @since 2018-11-27 21:51
 */
public interface IUserDao {
    public List<User> selectList();
}

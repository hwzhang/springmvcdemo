package com.studyspringmvcboot.service;

import com.studyspringmvcboot.vo.User;

import java.util.List;

/**
 * 功能描述：
 *
 * @author 张宏伟
 * @since 2018-11-27 21:51
 */
public interface IUserService {
    public List<User> selectList();
}

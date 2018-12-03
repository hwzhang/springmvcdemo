package com.studyspringmvcboot.service;

import com.studyspringmvcboot.dao.IUserDao;
import com.studyspringmvcboot.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述：
 *
 * @author 张宏伟
 * @since 2018-11-27 21:51
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao dao;

    @Override
    public List<User> selectList() {
        return dao.selectList();
    }
}

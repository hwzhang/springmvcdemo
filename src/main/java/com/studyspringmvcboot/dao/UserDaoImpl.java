package com.studyspringmvcboot.dao;

import com.studyspringmvcboot.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * 功能描述：
 *
 * @author 张宏伟
 * @since 2018-11-27 21:51
 */
@Repository
public class UserDaoImpl implements IUserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> selectList() {
        return jdbcTemplate.query("select * from user", new RowMapper() {

            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Date birthday = resultSet.getDate("birthday");
                return new User(id, name, birthday);
            }
        });
    }
}

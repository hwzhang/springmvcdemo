package com.studyspringmvcboot.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 功能描述：
 *
 * @author 张宏伟
 * @since 2018-11-27 21:52
 */
public class User implements Serializable {
    private static final long serialVersionUID = 8546973739748281355L;
    private Integer id;
    private String name;
    private Date birthday;

    public User() {

    }

    public User(Integer id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

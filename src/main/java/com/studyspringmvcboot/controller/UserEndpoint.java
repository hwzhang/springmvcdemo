package com.studyspringmvcboot.controller;

import com.studyspringmvcboot.service.IUserService;
import com.studyspringmvcboot.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author 张宏伟
 * @since 2018-11-27 18:04
 */
@Controller
@RequestMapping("/user")
public class UserEndpoint {

    @Autowired
    private IUserService service;

    @RequestMapping("/login")
    @ResponseBody
    public String login() {
        return "login";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<User> selectList() {
        return service.selectList();
    }

    @RequestMapping("/select/{id}")
    public ModelAndView selectList(@PathVariable("id") String id) {
        List<User> userList = service.selectList();
        ModelAndView view = new ModelAndView();
        if (userList == null || userList.size() == 0) {
            view.setViewName("empty");
            return view;
        }
        view.setViewName("list1");
        Map<String, Object> modelMap = view.getModel();
        modelMap.put("list", userList);
        return view;
    }

    @RequestMapping("/select/one")
    public ModelAndView selectListOne() {
        List<User> userList = service.selectList();
        ModelAndView view = new ModelAndView();
        if (userList == null || userList.size() == 0) {
            view.setViewName("empty");
            return view;
        }
        view.setViewName("one");
        Map<String, Object> modelMap = view.getModel();
        modelMap.put("list", userList);
        return view;
    }

    @RequestMapping("/select/two")
    public String selectListTwo() {
        return "two";
    }
}

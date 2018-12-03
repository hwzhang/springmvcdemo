package com.studyspringmvcboot.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 功能描述：
 *
 * @author 张宏伟
 * @since 2018-11-28 14:55
 */
@Controller
public class MyErrorController implements ErrorController {
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request){
        //获取statusCode:401,404,500
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if(statusCode == HttpStatus.UNAUTHORIZED.value()){
            return "/public/error/401";
        }else if(statusCode == HttpStatus.NOT_FOUND.value()){
            return "../public/error/404";
        }else if(statusCode == HttpStatus.FORBIDDEN.value()){
            return "/public/error/403";
        }else{
            return "/public/error/500";
        }

    }
    @Override
    public String getErrorPath() {
        return "/error";
    }
}

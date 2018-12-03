package com.studyspringmvcboot.configure;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;

/**
 * 功能描述：
 *
 * @author 张宏伟
 * @since 2018-11-29 22:02
 */
//@Component
public class MyErrorPageRegistrar implements ErrorPageRegistrar {
    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        /*1、按错误的类型显示错误的网页*/
        ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND, "/public/error/404.html");
        ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/public/error/500.html");
        /*2、按具体某个异常显示错误的网页*/
        /*当某个异常即可以根据错误类型显示错误网页，由可以根据某个具体的异常来显示错误网页时，优先根据具体的某个异常显示错误的网页*/
        ErrorPage argsException = new ErrorPage(IllegalArgumentException.class, "/public/error/args.html");
        registry.addErrorPages(e404, e500, argsException);
    }
}

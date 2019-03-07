package com.itbaizhan.controller;

import com.itbaizhan.pojo.RespBean;
import com.itbaizhan.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LoginController {
    //处理登录请求
    @PostMapping("/doLogin")
    public RespBean doLogin(@RequestBody User user) {
        //@RequestBody表示接收一个json数据
        RespBean respBean;
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(user.getUsername(), user.getPassword()));
            respBean = RespBean.ok("登录成功!",subject.getPrincipal());
        } catch (AuthenticationException e) {
            respBean = RespBean.error("登录失败!");
        }
        return respBean;
    }

    //未登录或登录错误返回的提示
    @GetMapping("/login")
    public RespBean toLogin() {
        return RespBean.error("用户未登录");
    }

    @GetMapping("/hello")
    public String login() {
        return "hello!";
    }
}

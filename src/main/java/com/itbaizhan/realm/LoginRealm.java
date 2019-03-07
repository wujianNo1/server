package com.itbaizhan.realm;


import com.itbaizhan.pojo.User;
import com.itbaizhan.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

//该类配置shiro
public class LoginRealm extends AuthorizingRealm {
    //将service注入
    @Autowired
    UserService userService;
    //授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
    //登录
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = ((UsernamePasswordToken) token).getUsername();
        User user = userService.loadUserByUsername(username);
        System.out.println(user);
        if (user == null) {
            throw new UnknownAccountException("用户名输入错误!");
        }
        return new SimpleAuthenticationInfo(username, user.getPassword(), getName());
    }
}

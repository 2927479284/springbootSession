package com.example.springbootsessiondemo1.domain.vo;

import lombok.Data;

/**
 * 用户登录vo
 */

@Data
public class LoginVo {
    /**
     * 账号
     */
    private String user;

    /**
     * 密码
     */
    private String pwd;

}

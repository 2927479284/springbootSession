package com.example.springbootsessiondemo1.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.springbootsessiondemo1.common.AjaxResult;
import com.example.springbootsessiondemo1.domain.entity.User;
import com.example.springbootsessiondemo1.domain.vo.LoginVo;
import com.example.springbootsessiondemo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * 用户认证
 */
@RequestMapping("auth/")
@RestController
public class AuthController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping("login")
    public AjaxResult login(@RequestBody LoginVo loginVo,HttpSession session){
        User user = userMapper.selectOne(Wrappers.<User>lambdaQuery()
                .eq(User::getUser, loginVo.getUser()));
        if (user.getPwd().equals(loginVo.getPwd())){
            //设置Session
            session.setAttribute("session", user.getUser() + user.getPwd());
            System.out.println("登录成功");
            return AjaxResult.success("登录成功",user.getId());
        }
        return AjaxResult.error("账号密码错误");
    }

    /**
     * 通过id获取详情信息
     * @param id
     * @return
     */
    @GetMapping("info")
    public AjaxResult getInfo(@RequestParam("id") Long id){
        User user = userMapper.selectById(id);
        System.out.println("获取成功");
        return AjaxResult.success("获取成功",user.getUser());
    }
}

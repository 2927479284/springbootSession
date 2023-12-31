package com.example.springbootsessiondemo1.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.example.springbootsessiondemo1.common.AjaxResult;
import com.example.springbootsessiondemo1.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootsessiondemo1.service.IUserService;

import static com.example.springbootsessiondemo1.common.AjaxResult.success;
/**
 * 用户Controller
 *
 * @author ruoyi
 * @date 2023-11-01
 */
@RestController
@RequestMapping("/system/user")
public class UserController
{
    @Autowired
    private IUserService userService;

    /**
     * 查询用户列表
     */

    @GetMapping("/list")
    public List<User> list(User user)
    {

        List<User> list = userService.selectUserList(user);
        return list;
    }


    /**
     * 获取用户详细信息
     */

    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(userService.selectUserById(id));
    }

    /**
     * 新增用户
     */


    @PostMapping
    public AjaxResult add(@RequestBody User user)
    {
        userService.insertUser(user);
        return success();
    }

    /**
     * 修改用户
     */


    @PutMapping
    public AjaxResult edit(@RequestBody User user)
    {
        userService.updateUser(user);
        return success();
    }

    /**
     * 删除用户
     */


	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        userService.deleteUserByIds(ids);
        return success();
    }
}

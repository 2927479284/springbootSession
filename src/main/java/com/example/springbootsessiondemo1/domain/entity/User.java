package com.example.springbootsessiondemo1.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 用户对象 user
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@TableName(value = "user")
public class User
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 账号 */
    
    private String user;

    /** 密码 */
    
    private String pwd;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUser(String user) 
    {
        this.user = user;
    }

    public String getUser() 
    {
        return user;
    }
    public void setPwd(String pwd) 
    {
        this.pwd = pwd;
    }

    public String getPwd() 
    {
        return pwd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("user", getUser())
            .append("pwd", getPwd())
            .toString();
    }
}

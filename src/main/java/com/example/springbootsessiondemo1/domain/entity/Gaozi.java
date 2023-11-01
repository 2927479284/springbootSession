package com.example.springbootsessiondemo1.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 稿子审核管理对象 gaozi
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@TableName(value = "gaozi")
public class Gaozi 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 地区 */
    
    private String city;

    /** 类型 */
    
    private String type;

    /** 名称 */
    
    private String name;

    /** 年龄 */
    
    private Long age;

    /** 圈龄 */
    
    private Long qage;

    /** 简介 */
    
    private String Introduction;

    /** 需求 */
    
    private String content;

    /** 图片 */
    
    private String imgUrl;

    /** 状态 */
    
    private Long status;

    /** url */
    
    private String url;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
    }
    public void setQage(Long qage) 
    {
        this.qage = qage;
    }

    public Long getQage() 
    {
        return qage;
    }
    public void setIntroduction(String Introduction) 
    {
        this.Introduction = Introduction;
    }

    public String getIntroduction() 
    {
        return Introduction;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setImgUrl(String imgUrl) 
    {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() 
    {
        return imgUrl;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("city", getCity())
            .append("type", getType())
            .append("name", getName())
            .append("age", getAge())
            .append("qage", getQage())
            .append("Introduction", getIntroduction())
            .append("content", getContent())
            .append("imgUrl", getImgUrl())
            .append("status", getStatus())
            .append("url", getUrl())
            .toString();
    }
}

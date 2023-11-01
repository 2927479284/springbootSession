package com.example.springbootsessiondemo1.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 群聊审核管理对象 group_
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@TableName(value = "group")
public class Group 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 地区 */
    
    private String city;

    /** 名称 */
    
    private String name;

    /** 类型 */
    
    private String type;

    /** 简介 */
    
    private String content;

    /** 群二维码 */
    
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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
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
            .append("name", getName())
            .append("type", getType())
            .append("content", getContent())
            .append("imgUrl", getImgUrl())
            .append("status", getStatus())
            .append("url", getUrl())
            .toString();
    }
}

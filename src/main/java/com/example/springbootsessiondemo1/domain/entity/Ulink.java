package com.example.springbootsessiondemo1.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 友情链接审核管理对象 ulink
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@TableName(value = "ulink")
public class Ulink 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 友链地址 */
    
    private String url;

    /** 友链名称 */
    
    private String name;

    /** 友链状态 */
    
    private Long status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("url", getUrl())
            .append("name", getName())
            .append("status", getStatus())
            .toString();
    }
}

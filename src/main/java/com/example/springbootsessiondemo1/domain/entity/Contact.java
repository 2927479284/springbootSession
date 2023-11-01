package com.example.springbootsessiondemo1.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 联系方式对象 contact
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@TableName(value = "contact")
public class Contact 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 联系方式 */
    
    private String contnet;

    /** 类型(1为正常联系方式，2为二维码) */
    
    private Long type;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setContnet(String contnet) 
    {
        this.contnet = contnet;
    }

    public String getContnet() 
    {
        return contnet;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("contnet", getContnet())
            .append("type", getType())
            .toString();
    }
}

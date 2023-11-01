package com.example.springbootsessiondemo1.domain.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 广告审核对象 ad
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@TableName(value = "ad")
public class Ad 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 名字 */
    
    private String name;

    /** 广告图片1 */
    
    private String imgurl1;

    /** 广告图片2 */
    
    private String imgurl2;

    /** 状态(0待审核 1已通过 2已拒绝 3) */
    
    private Long status;

    /** 跳转地址1 */
    
    private String url1;

    /** 跳转地址2 */
    
    private String url2;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setImgurl1(String imgurl1) 
    {
        this.imgurl1 = imgurl1;
    }

    public String getImgurl1() 
    {
        return imgurl1;
    }
    public void setImgurl2(String imgurl2) 
    {
        this.imgurl2 = imgurl2;
    }

    public String getImgurl2() 
    {
        return imgurl2;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setUrl1(String url1) 
    {
        this.url1 = url1;
    }

    public String getUrl1() 
    {
        return url1;
    }
    public void setUrl2(String url2) 
    {
        this.url2 = url2;
    }

    public String getUrl2() 
    {
        return url2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("imgurl1", getImgurl1())
            .append("imgurl2", getImgurl2())
            .append("status", getStatus())
            .append("url1", getUrl1())
            .append("url2", getUrl2())
            .toString();
    }
}

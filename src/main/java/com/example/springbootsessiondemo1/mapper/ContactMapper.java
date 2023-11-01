package com.example.springbootsessiondemo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootsessiondemo1.domain.entity.Ad;
import com.example.springbootsessiondemo1.domain.entity.Contact;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 联系方式Mapper接口
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@Mapper
public interface ContactMapper extends BaseMapper<Contact>
{
    /**
     * 查询联系方式
     * 
     * @param id 联系方式主键
     * @return 联系方式
     */
    public Contact selectContactById(Long id);

    /**
     * 查询联系方式列表
     * 
     * @param contact 联系方式
     * @return 联系方式集合
     */
    public List<Contact> selectContactList(Contact contact);

    /**
     * 新增联系方式
     * 
     * @param contact 联系方式
     * @return 结果
     */
    public int insertContact(Contact contact);

    /**
     * 修改联系方式
     * 
     * @param contact 联系方式
     * @return 结果
     */
    public int updateContact(Contact contact);

    /**
     * 删除联系方式
     * 
     * @param id 联系方式主键
     * @return 结果
     */
    public int deleteContactById(Long id);

    /**
     * 批量删除联系方式
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteContactByIds(Long[] ids);
}

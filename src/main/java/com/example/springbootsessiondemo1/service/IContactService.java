package com.example.springbootsessiondemo1.service;

import com.example.springbootsessiondemo1.domain.entity.Contact;

import java.util.List;

/**
 * 联系方式Service接口
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
public interface IContactService 
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
     * 批量删除联系方式
     * 
     * @param ids 需要删除的联系方式主键集合
     * @return 结果
     */
    public int deleteContactByIds(Long[] ids);

    /**
     * 删除联系方式信息
     * 
     * @param id 联系方式主键
     * @return 结果
     */
    public int deleteContactById(Long id);
}

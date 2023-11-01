package com.example.springbootsessiondemo1.service.impl;

import java.util.List;

import com.example.springbootsessiondemo1.domain.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootsessiondemo1.mapper.ContactMapper;
import com.example.springbootsessiondemo1.service.IContactService;

/**
 * 联系方式Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@Service
public class ContactServiceImpl implements IContactService 
{
    @Autowired
    private ContactMapper contactMapper;

    /**
     * 查询联系方式
     * 
     * @param id 联系方式主键
     * @return 联系方式
     */
    @Override
    public Contact selectContactById(Long id)
    {
        return contactMapper.selectContactById(id);
    }

    /**
     * 查询联系方式列表
     * 
     * @param contact 联系方式
     * @return 联系方式
     */
    @Override
    public List<Contact> selectContactList(Contact contact)
    {
        return contactMapper.selectContactList(contact);
    }

    /**
     * 新增联系方式
     * 
     * @param contact 联系方式
     * @return 结果
     */
    @Override
    public int insertContact(Contact contact)
    {
        return contactMapper.insertContact(contact);
    }

    /**
     * 修改联系方式
     * 
     * @param contact 联系方式
     * @return 结果
     */
    @Override
    public int updateContact(Contact contact)
    {
        return contactMapper.updateContact(contact);
    }

    /**
     * 批量删除联系方式
     * 
     * @param ids 需要删除的联系方式主键
     * @return 结果
     */
    @Override
    public int deleteContactByIds(Long[] ids)
    {
        return contactMapper.deleteContactByIds(ids);
    }

    /**
     * 删除联系方式信息
     * 
     * @param id 联系方式主键
     * @return 结果
     */
    @Override
    public int deleteContactById(Long id)
    {
        return contactMapper.deleteContactById(id);
    }


    @Override
    public void updateStatus(Contact contact) {
        contactMapper.updateById(contact);
    }
}

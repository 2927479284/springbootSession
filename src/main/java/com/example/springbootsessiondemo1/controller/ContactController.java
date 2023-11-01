package com.example.springbootsessiondemo1.controller;

import java.util.List;

import com.example.springbootsessiondemo1.common.AjaxResult;
import com.example.springbootsessiondemo1.domain.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootsessiondemo1.service.IContactService;

import static com.example.springbootsessiondemo1.common.AjaxResult.success;
/**
 * 联系方式Controller
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@RestController
@RequestMapping("/system/contact")
public class ContactController 
{
    @Autowired
    private IContactService contactService;

    /**
     * 查询联系方式列表
     */
    
    @GetMapping("/list")
    public List<Contact> list(Contact contact)
    {

        List<Contact> list = contactService.selectContactList(contact);
        return list;
    }

    /**
     * 获取联系方式详细信息
     */
    
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(contactService.selectContactById(id));
    }

    /**
     * 新增联系方式
     */
    
    
    @PostMapping
    public AjaxResult add(@RequestBody Contact contact)
    {
        contactService.insertContact(contact);
        return success();
    }

    /**
     * 修改联系方式
     */
    
    
    @PutMapping
    public AjaxResult edit(@RequestBody Contact contact)
    {
        contactService.updateContact(contact);
        return success();
    }

    /**
     * 删除联系方式
     */
    
    
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        contactService.deleteContactByIds(ids);
        return success();
    }
}

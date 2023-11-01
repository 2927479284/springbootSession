package com.example.springbootsessiondemo1.service;

import com.example.springbootsessiondemo1.domain.entity.Group;

import java.util.List;

/**
 * 群聊审核管理Service接口
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
public interface IGroupService 
{
    /**
     * 查询群聊审核管理
     * 
     * @param id 群聊审核管理主键
     * @return 群聊审核管理
     */
    public Group selectGroupById(Long id);

    /**
     * 查询群聊审核管理列表
     * 
     * @param group 群聊审核管理
     * @return 群聊审核管理集合
     */
    public List<Group> selectGroupList(Group group);

    /**
     * 新增群聊审核管理
     * 
     * @param group 群聊审核管理
     * @return 结果
     */
    public int insertGroup(Group group);

    /**
     * 修改群聊审核管理
     * 
     * @param group 群聊审核管理
     * @return 结果
     */
    public int updateGroup(Group group);

    /**
     * 批量删除群聊审核管理
     * 
     * @param ids 需要删除的群聊审核管理主键集合
     * @return 结果
     */
    public int deleteGroupByIds(Long[] ids);

    /**
     * 删除群聊审核管理信息
     * 
     * @param id 群聊审核管理主键
     * @return 结果
     */
    public int deleteGroupById(Long id);
}

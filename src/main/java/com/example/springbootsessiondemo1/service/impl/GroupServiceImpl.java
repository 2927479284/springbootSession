package com.example.springbootsessiondemo1.service.impl;

import java.util.List;

import com.example.springbootsessiondemo1.domain.entity.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootsessiondemo1.mapper.GroupMapper;
import com.example.springbootsessiondemo1.service.IGroupService;

/**
 * 群聊审核管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@Service
public class GroupServiceImpl implements IGroupService 
{
    @Autowired
    private GroupMapper groupMapper;

    /**
     * 查询群聊审核管理
     * 
     * @param id 群聊审核管理主键
     * @return 群聊审核管理
     */
    @Override
    public Group selectGroupById(Long id)
    {
        return groupMapper.selectGroupById(id);
    }

    /**
     * 查询群聊审核管理列表
     * 
     * @param group 群聊审核管理
     * @return 群聊审核管理
     */
    @Override
    public List<Group> selectGroupList(Group group)
    {
        return groupMapper.selectGroupList(group);
    }

    /**
     * 新增群聊审核管理
     * 
     * @param group 群聊审核管理
     * @return 结果
     */
    @Override
    public int insertGroup(Group group)
    {
        return groupMapper.insertGroup(group);
    }

    /**
     * 修改群聊审核管理
     * 
     * @param group 群聊审核管理
     * @return 结果
     */
    @Override
    public int updateGroup(Group group)
    {
        return groupMapper.updateGroup(group);
    }

    /**
     * 批量删除群聊审核管理
     * 
     * @param ids 需要删除的群聊审核管理主键
     * @return 结果
     */
    @Override
    public int deleteGroupByIds(Long[] ids)
    {
        return groupMapper.deleteGroupByIds(ids);
    }

    /**
     * 删除群聊审核管理信息
     * 
     * @param id 群聊审核管理主键
     * @return 结果
     */
    @Override
    public int deleteGroupById(Long id)
    {
        return groupMapper.deleteGroupById(id);
    }

    @Override
    public void updateStatus(Group group) {
        groupMapper.updateById(group);
    }
}

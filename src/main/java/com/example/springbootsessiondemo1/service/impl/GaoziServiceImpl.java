package com.example.springbootsessiondemo1.service.impl;

import java.util.List;

import com.example.springbootsessiondemo1.domain.entity.Gaozi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootsessiondemo1.mapper.GaoziMapper;
import com.example.springbootsessiondemo1.service.IGaoziService;

/**
 * 稿子审核管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@Service
public class GaoziServiceImpl implements IGaoziService 
{
    @Autowired
    private GaoziMapper gaoziMapper;

    /**
     * 查询稿子审核管理
     * 
     * @param id 稿子审核管理主键
     * @return 稿子审核管理
     */
    @Override
    public Gaozi selectGaoziById(Long id)
    {
        return gaoziMapper.selectGaoziById(id);
    }

    /**
     * 查询稿子审核管理列表
     * 
     * @param gaozi 稿子审核管理
     * @return 稿子审核管理
     */
    @Override
    public List<Gaozi> selectGaoziList(Gaozi gaozi)
    {
        return gaoziMapper.selectGaoziList(gaozi);
    }

    /**
     * 新增稿子审核管理
     * 
     * @param gaozi 稿子审核管理
     * @return 结果
     */
    @Override
    public int insertGaozi(Gaozi gaozi)
    {
        return gaoziMapper.insertGaozi(gaozi);
    }

    /**
     * 修改稿子审核管理
     * 
     * @param gaozi 稿子审核管理
     * @return 结果
     */
    @Override
    public int updateGaozi(Gaozi gaozi)
    {
        return gaoziMapper.updateGaozi(gaozi);
    }

    /**
     * 批量删除稿子审核管理
     * 
     * @param ids 需要删除的稿子审核管理主键
     * @return 结果
     */
    @Override
    public int deleteGaoziByIds(Long[] ids)
    {
        return gaoziMapper.deleteGaoziByIds(ids);
    }

    /**
     * 删除稿子审核管理信息
     * 
     * @param id 稿子审核管理主键
     * @return 结果
     */
    @Override
    public int deleteGaoziById(Long id)
    {
        return gaoziMapper.deleteGaoziById(id);
    }
}

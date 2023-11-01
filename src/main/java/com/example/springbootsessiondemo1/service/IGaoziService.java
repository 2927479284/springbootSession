package com.example.springbootsessiondemo1.service;

import com.example.springbootsessiondemo1.domain.entity.Gaozi;

import java.util.List;

/**
 * 稿子审核管理Service接口
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
public interface IGaoziService 
{
    /**
     * 查询稿子审核管理
     * 
     * @param id 稿子审核管理主键
     * @return 稿子审核管理
     */
    public Gaozi selectGaoziById(Long id);

    /**
     * 查询稿子审核管理列表
     * 
     * @param gaozi 稿子审核管理
     * @return 稿子审核管理集合
     */
    public List<Gaozi> selectGaoziList(Gaozi gaozi);

    /**
     * 新增稿子审核管理
     * 
     * @param gaozi 稿子审核管理
     * @return 结果
     */
    public int insertGaozi(Gaozi gaozi);

    /**
     * 修改稿子审核管理
     * 
     * @param gaozi 稿子审核管理
     * @return 结果
     */
    public int updateGaozi(Gaozi gaozi);

    /**
     * 批量删除稿子审核管理
     * 
     * @param ids 需要删除的稿子审核管理主键集合
     * @return 结果
     */
    public int deleteGaoziByIds(Long[] ids);

    /**
     * 删除稿子审核管理信息
     * 
     * @param id 稿子审核管理主键
     * @return 结果
     */
    public int deleteGaoziById(Long id);
}

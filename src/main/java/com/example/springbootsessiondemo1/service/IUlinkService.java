package com.example.springbootsessiondemo1.service;

import com.example.springbootsessiondemo1.domain.entity.Ulink;

import java.util.List;

/**
 * 友情链接审核管理Service接口
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
public interface IUlinkService 
{
    /**
     * 查询友情链接审核管理
     * 
     * @param id 友情链接审核管理主键
     * @return 友情链接审核管理
     */
    public Ulink selectUlinkById(Long id);

    /**
     * 查询友情链接审核管理列表
     * 
     * @param ulink 友情链接审核管理
     * @return 友情链接审核管理集合
     */
    public List<Ulink> selectUlinkList(Ulink ulink);

    /**
     * 新增友情链接审核管理
     * 
     * @param ulink 友情链接审核管理
     * @return 结果
     */
    public int insertUlink(Ulink ulink);

    /**
     * 修改友情链接审核管理
     * 
     * @param ulink 友情链接审核管理
     * @return 结果
     */
    public int updateUlink(Ulink ulink);

    /**
     * 批量删除友情链接审核管理
     * 
     * @param ids 需要删除的友情链接审核管理主键集合
     * @return 结果
     */
    public int deleteUlinkByIds(Long[] ids);

    /**
     * 删除友情链接审核管理信息
     * 
     * @param id 友情链接审核管理主键
     * @return 结果
     */
    public int deleteUlinkById(Long id);

    void updateStatus(Ulink ulink);
}

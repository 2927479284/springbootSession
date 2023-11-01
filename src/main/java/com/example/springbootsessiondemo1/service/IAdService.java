package com.example.springbootsessiondemo1.service;

import com.example.springbootsessiondemo1.domain.entity.Ad;

import java.util.List;

/**
 * 广告审核Service接口
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
public interface IAdService 
{
    /**
     * 查询广告审核
     * 
     * @param id 广告审核主键
     * @return 广告审核
     */
    public Ad selectAdById(Long id);

    /**
     * 查询广告审核列表
     * 
     * @param ad 广告审核
     * @return 广告审核集合
     */
    public List<Ad> selectAdList(Ad ad);

    /**
     * 新增广告审核
     * 
     * @param ad 广告审核
     * @return 结果
     */
    public int insertAd(Ad ad);

    /**
     * 修改广告审核
     * 
     * @param ad 广告审核
     * @return 结果
     */
    public int updateAd(Ad ad);

    /**
     * 批量删除广告审核
     * 
     * @param ids 需要删除的广告审核主键集合
     * @return 结果
     */
    public int deleteAdByIds(Long[] ids);

    /**
     * 删除广告审核信息
     * 
     * @param id 广告审核主键
     * @return 结果
     */
    public int deleteAdById(Long id);
}

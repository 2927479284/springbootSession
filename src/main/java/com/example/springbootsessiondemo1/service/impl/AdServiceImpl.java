package com.example.springbootsessiondemo1.service.impl;

import java.util.List;

import com.example.springbootsessiondemo1.domain.entity.Ad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootsessiondemo1.mapper.AdMapper;
import com.example.springbootsessiondemo1.service.IAdService;

/**
 * 广告审核Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@Service("iAdService")
public class AdServiceImpl implements IAdService 
{
    @Autowired
    private AdMapper adMapper;

    /**
     * 查询广告审核
     * 
     * @param id 广告审核主键
     * @return 广告审核
     */
    @Override
    public Ad selectAdById(Long id)
    {
        return adMapper.selectAdById(id);
    }

    /**
     * 查询广告审核列表
     * 
     * @param ad 广告审核
     * @return 广告审核
     */
    @Override
    public List<Ad> selectAdList(Ad ad)
    {
        return adMapper.selectAdList(ad);
    }

    /**
     * 新增广告审核
     * 
     * @param ad 广告审核
     * @return 结果
     */
    @Override
    public int insertAd(Ad ad)
    {
        return adMapper.insertAd(ad);
    }

    /**
     * 修改广告审核
     * 
     * @param ad 广告审核
     * @return 结果
     */
    @Override
    public int updateAd(Ad ad)
    {
        return adMapper.updateAd(ad);
    }

    /**
     * 批量删除广告审核
     * 
     * @param ids 需要删除的广告审核主键
     * @return 结果
     */
    @Override
    public int deleteAdByIds(Long[] ids)
    {
        return adMapper.deleteAdByIds(ids);
    }

    /**
     * 删除广告审核信息
     * 
     * @param id 广告审核主键
     * @return 结果
     */
    @Override
    public int deleteAdById(Long id)
    {
        return adMapper.deleteAdById(id);
    }
}

package com.example.springbootsessiondemo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootsessiondemo1.domain.entity.Ad;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 广告审核Mapper接口
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@Mapper
public interface AdMapper extends BaseMapper<Ad>
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
     * 删除广告审核
     * 
     * @param id 广告审核主键
     * @return 结果
     */
    public int deleteAdById(Long id);

    /**
     * 批量删除广告审核
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAdByIds(Long[] ids);
}

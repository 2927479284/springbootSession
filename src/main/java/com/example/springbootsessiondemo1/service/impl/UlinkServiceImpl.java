package com.example.springbootsessiondemo1.service.impl;

import java.util.List;

import com.example.springbootsessiondemo1.domain.entity.Ulink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootsessiondemo1.mapper.UlinkMapper;
import com.example.springbootsessiondemo1.service.IUlinkService;

/**
 * 友情链接审核管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@Service
public class UlinkServiceImpl implements IUlinkService 
{
    @Autowired
    private UlinkMapper ulinkMapper;

    /**
     * 查询友情链接审核管理
     * 
     * @param id 友情链接审核管理主键
     * @return 友情链接审核管理
     */
    @Override
    public Ulink selectUlinkById(Long id)
    {
        return ulinkMapper.selectUlinkById(id);
    }

    /**
     * 查询友情链接审核管理列表
     * 
     * @param ulink 友情链接审核管理
     * @return 友情链接审核管理
     */
    @Override
    public List<Ulink> selectUlinkList(Ulink ulink)
    {
        return ulinkMapper.selectUlinkList(ulink);
    }

    /**
     * 新增友情链接审核管理
     * 
     * @param ulink 友情链接审核管理
     * @return 结果
     */
    @Override
    public int insertUlink(Ulink ulink)
    {
        return ulinkMapper.insertUlink(ulink);
    }

    /**
     * 修改友情链接审核管理
     * 
     * @param ulink 友情链接审核管理
     * @return 结果
     */
    @Override
    public int updateUlink(Ulink ulink)
    {
        return ulinkMapper.updateUlink(ulink);
    }

    /**
     * 批量删除友情链接审核管理
     * 
     * @param ids 需要删除的友情链接审核管理主键
     * @return 结果
     */
    @Override
    public int deleteUlinkByIds(Long[] ids)
    {
        return ulinkMapper.deleteUlinkByIds(ids);
    }

    /**
     * 删除友情链接审核管理信息
     * 
     * @param id 友情链接审核管理主键
     * @return 结果
     */
    @Override
    public int deleteUlinkById(Long id)
    {
        return ulinkMapper.deleteUlinkById(id);
    }


    @Override
    public void updateStatus(Ulink ulink) {
        ulinkMapper.updateById(ulink);
    }
}

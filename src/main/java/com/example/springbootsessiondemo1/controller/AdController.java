package com.example.springbootsessiondemo1.controller;

import java.util.List;

import com.example.springbootsessiondemo1.common.AjaxResult;
import com.example.springbootsessiondemo1.domain.entity.Ad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootsessiondemo1.service.IAdService;

import static com.example.springbootsessiondemo1.common.AjaxResult.success;

/**
 * 广告审核Controller
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@RestController
@RequestMapping("/system/ad")
public class AdController 
{
    @Autowired
    private IAdService adService;

    /**
     * 查询广告审核列表
     */
    
    @GetMapping("/list")
    public List<Ad> list(Ad ad)
    {
        
        List<Ad> list = adService.selectAdList(ad);
        return list;
    }

//    /**
//     * 导出广告审核列表
//     */
//
//
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Ad ad)
//    {
//        List<Ad> list = adService.selectAdList(ad);
//        ExcelUtil<Ad> util = new ExcelUtil<Ad>(Ad.class);
//        util.exportExcel(response, list, "广告审核数据");
//    }

    /**
     * 获取广告审核详细信息
     */
    
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(adService.selectAdById(id));
    }

    /**
     * 新增广告审核
     */
    
    
    @PostMapping
    public AjaxResult add(@RequestBody Ad ad)
    {
        adService.insertAd(ad);
        return success();
    }

    /**
     * 修改广告审核
     */
    
    
    @PutMapping
    public AjaxResult edit(@RequestBody Ad ad)
    {
        adService.updateAd(ad);
        return success();
    }

    /**
     * 删除广告审核
     */
    
    
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        adService.deleteAdByIds(ids);
        return success();
    }
}

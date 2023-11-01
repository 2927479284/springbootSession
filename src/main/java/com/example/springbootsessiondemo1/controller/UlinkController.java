package com.example.springbootsessiondemo1.controller;

import com.example.springbootsessiondemo1.common.AjaxResult;
import com.example.springbootsessiondemo1.domain.entity.Ad;
import com.example.springbootsessiondemo1.domain.entity.Ulink;
import com.example.springbootsessiondemo1.service.IUlinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static com.example.springbootsessiondemo1.common.AjaxResult.success;
/**
 * 友情链接审核管理Controller
 *
 * @author ruoyi
 * @date 2023-11-01
 */
@RestController
@RequestMapping("/system/ulink")
public class UlinkController
{
    @Autowired
    private IUlinkService ulinkService;

    /**
     * 查询友情链接审核管理列表
     */

    @GetMapping("/list")
    public List<Ulink> list(Ulink ulink)
    {

        List<Ulink> list = ulinkService.selectUlinkList(ulink);
        return list;
    }


    /**
     * 获取友情链接审核管理详细信息
     */

    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ulinkService.selectUlinkById(id));
    }

    /**
     * 新增友情链接审核管理
     */


//    @PostMapping
//    public AjaxResult add(@RequestBody Ulink ulink)
//    {
//        ulinkService.insertUlink(ulink);
//        return success();
//    }
    @PostMapping
    public AjaxResult updateStatus(@RequestBody Ulink ulink)
    {
        ulinkService.updateStatus(ulink);
        return success();
    }

    /**
     * 修改友情链接审核管理
     */


    @PutMapping
    public AjaxResult edit(@RequestBody Ulink ulink)
    {
        ulinkService.updateUlink(ulink);
        return success();
    }

    /**
     * 删除友情链接审核管理
     */


	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        ulinkService.deleteUlinkByIds(ids);
        return success();
    }
}

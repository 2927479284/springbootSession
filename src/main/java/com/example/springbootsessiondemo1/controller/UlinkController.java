//package com.example.springbootsessiondemo1.controller;
//
//import java.util.List;
//import javax.servlet.http.HttpServletResponse;
//
//import com.example.springbootsessiondemo1.common.AjaxResult;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.example.springbootsessiondemo1.domain.Ulink;
//import com.example.springbootsessiondemo1.service.IUlinkService;
//import static com.example.springbootsessiondemo1.common.AjaxResult.success;
///**
// * 友情链接审核管理Controller
// *
// * @author ruoyi
// * @date 2023-11-01
// */
//@RestController
//@RequestMapping("/system/ulink")
//public class UlinkController
//{
//    @Autowired
//    private IUlinkService ulinkService;
//
//    /**
//     * 查询友情链接审核管理列表
//     */
//
//    @GetMapping("/list")
//    public TableDataInfo list(Ulink ulink)
//    {
//
//        List<Ulink> list = ulinkService.selectUlinkList(ulink);
//        return getDataTable(list);
//    }
//
//    /**
//     * 导出友情链接审核管理列表
//     */
//
//
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Ulink ulink)
//    {
//        List<Ulink> list = ulinkService.selectUlinkList(ulink);
//        ExcelUtil<Ulink> util = new ExcelUtil<Ulink>(Ulink.class);
//        util.exportExcel(response, list, "友情链接审核管理数据");
//    }
//
//    /**
//     * 获取友情链接审核管理详细信息
//     */
//
//    @GetMapping(value = "/{id}")
//    public AjaxResult getInfo(@PathVariable("id") Long id)
//    {
//        return success(ulinkService.selectUlinkById(id));
//    }
//
//    /**
//     * 新增友情链接审核管理
//     */
//
//
//    @PostMapping
//    public AjaxResult add(@RequestBody Ulink ulink)
//    {
//        return toAjax(ulinkService.insertUlink(ulink));
//    }
//
//    /**
//     * 修改友情链接审核管理
//     */
//
//
//    @PutMapping
//    public AjaxResult edit(@RequestBody Ulink ulink)
//    {
//        return toAjax(ulinkService.updateUlink(ulink));
//    }
//
//    /**
//     * 删除友情链接审核管理
//     */
//
//
//	@DeleteMapping("/{ids}")
//    public AjaxResult remove(@PathVariable Long[] ids)
//    {
//        return toAjax(ulinkService.deleteUlinkByIds(ids));
//    }
//}

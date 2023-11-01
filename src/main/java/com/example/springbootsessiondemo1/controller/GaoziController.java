//package com.example.springbootsessiondemo1.controller;
//
//import java.util.List;
//import javax.servlet.http.HttpServletResponse;
//
//import com.example.springbootsessiondemo1.common.AjaxResult;
//import com.example.springbootsessiondemo1.domain.entity.Gaozi;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.example.springbootsessiondemo1.service.IGaoziService;
//import static com.example.springbootsessiondemo1.common.AjaxResult.success;
///**
// * 稿子审核管理Controller
// *
// * @author ruoyi
// * @date 2023-11-01
// */
//@RestController
//@RequestMapping("/system/gaozi")
//public class GaoziController
//{
//    @Autowired
//    private IGaoziService gaoziService;
//
//    /**
//     * 查询稿子审核管理列表
//     */
//
//    @GetMapping("/list")
//    public List<Gaozi> list(Gaozi gaozi)
//    {
//
//        List<Gaozi> list = gaoziService.selectGaoziList(gaozi);
//        return list;
//    }
//
////    /**
////     * 导出稿子审核管理列表
////     */
////
////
////    @PostMapping("/export")
////    public void export(HttpServletResponse response, Gaozi gaozi)
////    {
////        List<Gaozi> list = gaoziService.selectGaoziList(gaozi);
////        ExcelUtil<Gaozi> util = new ExcelUtil<Gaozi>(Gaozi.class);
////        util.exportExcel(response, list, "稿子审核管理数据");
////    }
//
//    /**
//     * 获取稿子审核管理详细信息
//     */
//
//    @GetMapping(value = "/{id}")
//    public AjaxResult getInfo(@PathVariable("id") Long id)
//    {
//        return success(gaoziService.selectGaoziById(id));
//    }
//
//    /**
//     * 新增稿子审核管理
//     */
//
//
//    @PostMapping
//    public AjaxResult add(@RequestBody Gaozi gaozi)
//    {
//        return toAjax(gaoziService.insertGaozi(gaozi));
//    }
//
//    /**
//     * 修改稿子审核管理
//     */
//
//
//    @PutMapping
//    public AjaxResult edit(@RequestBody Gaozi gaozi)
//    {
//        return toAjax(gaoziService.updateGaozi(gaozi));
//    }
//
//    /**
//     * 删除稿子审核管理
//     */
//
//
//	@DeleteMapping("/{ids}")
//    public AjaxResult remove(@PathVariable Long[] ids)
//    {
//        return toAjax(gaoziService.deleteGaoziByIds(ids));
//    }
//}

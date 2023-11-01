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
//import com.example.springbootsessiondemo1.domain.Group;
//import com.example.springbootsessiondemo1.service.IGroupService;
//import static com.example.springbootsessiondemo1.common.AjaxResult.success;
//
///**
// * 群聊审核管理Controller
// *
// * @author ruoyi
// * @date 2023-11-01
// */
//@RestController
//@RequestMapping("/system/${businessName}")
//public class GroupController
//{
//    @Autowired
//    private IGroupService groupService;
//
//    /**
//     * 查询群聊审核管理列表
//     */
//
//    @GetMapping("/list")
//    public TableDataInfo list(Group group)
//    {
//
//        List<Group> list = groupService.selectGroupList(group);
//        return getDataTable(list);
//    }
//
//    /**
//     * 导出群聊审核管理列表
//     */
//
//
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Group group)
//    {
//        List<Group> list = groupService.selectGroupList(group);
//        ExcelUtil<Group> util = new ExcelUtil<Group>(Group.class);
//        util.exportExcel(response, list, "群聊审核管理数据");
//    }
//
//    /**
//     * 获取群聊审核管理详细信息
//     */
//
//    @GetMapping(value = "/{id}")
//    public AjaxResult getInfo(@PathVariable("id") Long id)
//    {
//        return success(groupService.selectGroupById(id));
//    }
//
//    /**
//     * 新增群聊审核管理
//     */
//
//
//    @PostMapping
//    public AjaxResult add(@RequestBody Group group)
//    {
//        return toAjax(groupService.insertGroup(group));
//    }
//
//    /**
//     * 修改群聊审核管理
//     */
//
//
//    @PutMapping
//    public AjaxResult edit(@RequestBody Group group)
//    {
//        return toAjax(groupService.updateGroup(group));
//    }
//
//    /**
//     * 删除群聊审核管理
//     */
//
//
//	@DeleteMapping("/{ids}")
//    public AjaxResult remove(@PathVariable Long[] ids)
//    {
//        return toAjax(groupService.deleteGroupByIds(ids));
//    }
//}

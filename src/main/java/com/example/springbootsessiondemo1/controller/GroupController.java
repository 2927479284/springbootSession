package com.example.springbootsessiondemo1.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.example.springbootsessiondemo1.common.AjaxResult;
import com.example.springbootsessiondemo1.domain.entity.Ad;
import com.example.springbootsessiondemo1.domain.entity.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootsessiondemo1.service.IGroupService;
import static com.example.springbootsessiondemo1.common.AjaxResult.success;

/**
 * 群聊审核管理Controller
 *
 * @author ruoyi
 * @date 2023-11-01
 */
@RestController
@RequestMapping("/system/group")
public class GroupController
{
    @Autowired
    private IGroupService groupService;

    /**
     * 查询群聊审核管理列表
     */

    @GetMapping("/list")
    public List<Group> list(Group group)
    {

        List<Group> list = groupService.selectGroupList(group);
        return list;
    }

    /**
     * 获取群聊审核管理详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(groupService.selectGroupById(id));
    }

    /**
     * 新增群聊审核管理
     */


//    @PostMapping
//    public AjaxResult add(@RequestBody Group group)
//    {
//        groupService.insertGroup(group);
//        return success();
//    }
    @PostMapping
    public AjaxResult updateStatus(@RequestBody Group group)
    {
        groupService.updateStatus(group);
        return success();
    }

    /**
     * 修改群聊审核管理
     */


    @PutMapping
    public AjaxResult edit(@RequestBody Group group)
    {
        groupService.updateGroup(group);
        return success();
    }

    /**
     * 删除群聊审核管理
     */


	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        groupService.deleteGroupByIds(ids);
        return success();
    }
}

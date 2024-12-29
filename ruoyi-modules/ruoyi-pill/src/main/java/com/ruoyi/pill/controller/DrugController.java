package com.ruoyi.pill.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.pill.domain.Drug;
import com.ruoyi.pill.service.IDrugService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 岗位信息Controller
 * 
 * @author ruoyi
 * @date 2024-05-21
 */
@RestController
@RequestMapping("/drug")
public class DrugController extends BaseController
{
    @Autowired
    private IDrugService drugService;

    /**
     * 查询岗位信息列表
     */
    @RequiresPermissions("pill:drug:list")
    @GetMapping("/list")
    public TableDataInfo list(Drug drug)
    {
        startPage();
        List<Drug> list = drugService.selectDrugList(drug);
        return getDataTable(list);
    }

    /**
     * 导出岗位信息列表
     */
    @RequiresPermissions("pill:drug:export")
    @Log(title = "岗位信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Drug drug)
    {
        List<Drug> list = drugService.selectDrugList(drug);
        ExcelUtil<Drug> util = new ExcelUtil<Drug>(Drug.class);
        util.exportExcel(response, list, "岗位信息数据");
    }

    /**
     * 获取岗位信息详细信息
     */
    @RequiresPermissions("pill:drug:query")
    @GetMapping(value = "/{postId}")
    public AjaxResult getInfo(@PathVariable("postId") Long postId)
    {
        return success(drugService.selectDrugByPostId(postId));
    }

    /**
     * 新增岗位信息
     */
    @RequiresPermissions("pill:drug:add")
    @Log(title = "岗位信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Drug drug)
    {
        return toAjax(drugService.insertDrug(drug));
    }

    /**
     * 修改岗位信息
     */
    @RequiresPermissions("pill:drug:edit")
    @Log(title = "岗位信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Drug drug)
    {
        return toAjax(drugService.updateDrug(drug));
    }

    /**
     * 删除岗位信息
     */
    @RequiresPermissions("pill:drug:remove")
    @Log(title = "岗位信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{postIds}")
    public AjaxResult remove(@PathVariable Long[] postIds)
    {
        return toAjax(drugService.deleteDrugByPostIds(postIds));
    }
}

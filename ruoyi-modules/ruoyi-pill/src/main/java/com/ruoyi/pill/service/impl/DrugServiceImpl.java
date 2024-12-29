package com.ruoyi.pill.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.pill.mapper.DrugMapper;
import com.ruoyi.pill.domain.Drug;
import com.ruoyi.pill.service.IDrugService;

/**
 * 岗位信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-21
 */
@Service
public class DrugServiceImpl implements IDrugService 
{
    @Autowired
    private DrugMapper drugMapper;

    /**
     * 查询岗位信息
     * 
     * @param postId 岗位信息主键
     * @return 岗位信息
     */
    @Override
    public Drug selectDrugByPostId(Long postId)
    {
        return drugMapper.selectDrugByPostId(postId);
    }

    /**
     * 查询岗位信息列表
     * 
     * @param drug 岗位信息
     * @return 岗位信息
     */
    @Override
    public List<Drug> selectDrugList(Drug drug)
    {
        return drugMapper.selectDrugList(drug);
    }

    /**
     * 新增岗位信息
     * 
     * @param drug 岗位信息
     * @return 结果
     */
    @Override
    public int insertDrug(Drug drug)
    {
        drug.setCreateTime(DateUtils.getNowDate());
        return drugMapper.insertDrug(drug);
    }

    /**
     * 修改岗位信息
     * 
     * @param drug 岗位信息
     * @return 结果
     */
    @Override
    public int updateDrug(Drug drug)
    {
        drug.setUpdateTime(DateUtils.getNowDate());
        return drugMapper.updateDrug(drug);
    }

    /**
     * 批量删除岗位信息
     * 
     * @param postIds 需要删除的岗位信息主键
     * @return 结果
     */
    @Override
    public int deleteDrugByPostIds(Long[] postIds)
    {
        return drugMapper.deleteDrugByPostIds(postIds);
    }

    /**
     * 删除岗位信息信息
     * 
     * @param postId 岗位信息主键
     * @return 结果
     */
    @Override
    public int deleteDrugByPostId(Long postId)
    {
        return drugMapper.deleteDrugByPostId(postId);
    }
}

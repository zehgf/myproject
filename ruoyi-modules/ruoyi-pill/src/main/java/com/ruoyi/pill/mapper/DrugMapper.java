package com.ruoyi.pill.mapper;

import java.util.List;
import com.ruoyi.pill.domain.Drug;

/**
 * 岗位信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-21
 */
public interface DrugMapper 
{
    /**
     * 查询岗位信息
     * 
     * @param postId 岗位信息主键
     * @return 岗位信息
     */
    public Drug selectDrugByPostId(Long postId);

    /**
     * 查询岗位信息列表
     * 
     * @param drug 岗位信息
     * @return 岗位信息集合
     */
    public List<Drug> selectDrugList(Drug drug);

    /**
     * 新增岗位信息
     * 
     * @param drug 岗位信息
     * @return 结果
     */
    public int insertDrug(Drug drug);

    /**
     * 修改岗位信息
     * 
     * @param drug 岗位信息
     * @return 结果
     */
    public int updateDrug(Drug drug);

    /**
     * 删除岗位信息
     * 
     * @param postId 岗位信息主键
     * @return 结果
     */
    public int deleteDrugByPostId(Long postId);

    /**
     * 批量删除岗位信息
     * 
     * @param postIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDrugByPostIds(Long[] postIds);
}

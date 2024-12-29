package com.ruoyi.staff.service;

import java.util.List;
import com.ruoyi.staff.domain.User;

/**
 * 员工信息Service接口
 * 
 * @author ruoyi
 * @date 2024-05-21
 */
public interface IUserService 
{
    /**
     * 查询员工信息
     * 
     * @param id 员工信息主键
     * @return 员工信息
     */
    public User selectUserById(Long id);

    /**
     * 查询员工信息列表
     * 
     * @param user 员工信息
     * @return 员工信息集合
     */
    public List<User> selectUserList(User user);

    /**
     * 新增员工信息
     * 
     * @param user 员工信息
     * @return 结果
     */
    public int insertUser(User user);

    /**
     * 修改员工信息
     * 
     * @param user 员工信息
     * @return 结果
     */
    public int updateUser(User user);

    /**
     * 批量删除员工信息
     * 
     * @param ids 需要删除的员工信息主键集合
     * @return 结果
     */
    public int deleteUserByIds(Long[] ids);

    /**
     * 删除员工信息信息
     * 
     * @param id 员工信息主键
     * @return 结果
     */
    public int deleteUserById(Long id);
}

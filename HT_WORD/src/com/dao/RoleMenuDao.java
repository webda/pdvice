package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.RoleMenu;

import org.apache.ibatis.annotations.Param;
/**
 * RoleMenu的Dao接口
 * 
 * @author 
 *
 */
public interface RoleMenuDao {

	/**
	 * 获得RoleMenu数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getRoleMenuRowCount(Assist assist);
	
	/**
	 * 获得RoleMenu数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<RoleMenu> selectRoleMenu(Assist assist);
	/**
	 * 通过RoleMenu的id获得RoleMenu对象
	 * 
	 * @param id
	 * @return
	 */
	RoleMenu selectRoleMenuById(Integer id);
	
	/**
	 * 获得一个RoleMenu对象,以参数RoleMenu对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	RoleMenu selectRoleMenuObjSingle(RoleMenu obj);
	
	/**
	 * 获得一个RoleMenu对象,以参数RoleMenu对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<RoleMenu> selectRoleMenuByObj(RoleMenu obj);

	/**
	 * 插入RoleMenu到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertRoleMenu(RoleMenu value);
	
	/**
	 * 插入RoleMenu中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullRoleMenu(RoleMenu value);
	
	/**
	 * 批量插入RoleMenu到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertRoleMenuByBatch(List<RoleMenu> value);
	/**
	 * 通过RoleMenu的id删除RoleMenu
	 * 
	 * @param id
	 * @return
	 */
	int deleteRoleMenuById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除RoleMenu
	 * 
	 * @param assist
	 * @return
	 */
	int deleteRoleMenuByAssist(Assist assist);
	
	/**
	 * 通过RoleMenu的id更新RoleMenu中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateRoleMenuById(RoleMenu enti);
	
	/**
	 * 通过RoleMenu的id更新RoleMenu中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullRoleMenuById(RoleMenu enti);
	
	/**
	 * 通过辅助工具Assist的条件更新RoleMenu中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateRoleMenu(@Param("enti") RoleMenu value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新RoleMenu中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullRoleMenu(@Param("enti") RoleMenu value, @Param("assist") Assist assist);
}
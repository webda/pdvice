package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.Role;

import org.apache.ibatis.annotations.Param;
/**
 * Role的Dao接口
 * 
 * @author 
 *
 */
public interface RoleDao {

	/**
	 * 获得Role数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getRoleRowCount(Assist assist);
	
	/**
	 * 获得Role数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Role> selectRole(Assist assist);
	/**
	 * 通过Role的id获得Role对象
	 * 
	 * @param id
	 * @return
	 */
	Role selectRoleById(Integer id);
	
	/**
	 * 获得一个Role对象,以参数Role对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Role selectRoleObjSingle(Role obj);
	
	/**
	 * 获得一个Role对象,以参数Role对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Role> selectRoleByObj(Role obj);

	/**
	 * 插入Role到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertRole(Role value);
	
	/**
	 * 插入Role中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullRole(Role value);
	
	/**
	 * 批量插入Role到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertRoleByBatch(List<Role> value);
	/**
	 * 通过Role的id删除Role
	 * 
	 * @param id
	 * @return
	 */
	int deleteRoleById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除Role
	 * 
	 * @param assist
	 * @return
	 */
	int deleteRoleByAssist(Assist assist);
	
	/**
	 * 通过Role的id更新Role中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateRoleById(Role enti);
	
	/**
	 * 通过Role的id更新Role中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullRoleById(Role enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Role中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateRole(@Param("enti") Role value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Role中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullRole(@Param("enti") Role value, @Param("assist") Assist assist);
}
package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.UserRole;

import org.apache.ibatis.annotations.Param;
/**
 * UserRole的Dao接口
 * 
 * @author 
 *
 */
public interface UserRoleDao {

	/**
	 * 获得UserRole数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getUserRoleRowCount(Assist assist);
	
	/**
	 * 获得UserRole数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<UserRole> selectUserRole(Assist assist);
	/**
	 * 通过UserRole的id获得UserRole对象
	 * 
	 * @param id
	 * @return
	 */
	UserRole selectUserRoleById(Integer id);
	
	/**
	 * 获得一个UserRole对象,以参数UserRole对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	UserRole selectUserRoleObjSingle(UserRole obj);
	
	/**
	 * 获得一个UserRole对象,以参数UserRole对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<UserRole> selectUserRoleByObj(UserRole obj);

	/**
	 * 插入UserRole到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertUserRole(UserRole value);
	
	/**
	 * 插入UserRole中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullUserRole(UserRole value);
	
	/**
	 * 批量插入UserRole到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertUserRoleByBatch(List<UserRole> value);
	/**
	 * 通过UserRole的id删除UserRole
	 * 
	 * @param id
	 * @return
	 */
	int deleteUserRoleById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除UserRole
	 * 
	 * @param assist
	 * @return
	 */
	int deleteUserRoleByAssist(Assist assist);
	
	/**
	 * 通过UserRole的id更新UserRole中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateUserRoleById(UserRole enti);
	
	/**
	 * 通过UserRole的id更新UserRole中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullUserRoleById(UserRole enti);
	
	/**
	 * 通过辅助工具Assist的条件更新UserRole中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateUserRole(@Param("enti") UserRole value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新UserRole中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullUserRole(@Param("enti") UserRole value, @Param("assist") Assist assist);
}
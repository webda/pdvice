package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.Users;

import org.apache.ibatis.annotations.Param;
/**
 * Users的Dao接口
 * 
 * @author 
 *
 */
public interface UsersDao {

	/**
	 * 获得Users数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getUsersRowCount(Assist assist);
	
	/**
	 * 获得Users数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Users> selectUsers(Assist assist);
	/**
	 * 通过Users的id获得Users对象
	 * 
	 * @param id
	 * @return
	 */
	Users selectUsersById(Integer id);
	
	/**
	 * 获得一个Users对象,以参数Users对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Users selectUsersObjSingle(Users obj);
	
	/**
	 * 获得一个Users对象,以参数Users对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Users> selectUsersByObj(Users obj);

	/**
	 * 插入Users到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertUsers(Users value);
	
	/**
	 * 插入Users中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullUsers(Users value);
	
	/**
	 * 批量插入Users到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertUsersByBatch(List<Users> value);
	/**
	 * 通过Users的id删除Users
	 * 
	 * @param id
	 * @return
	 */
	int deleteUsersById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除Users
	 * 
	 * @param assist
	 * @return
	 */
	int deleteUsersByAssist(Assist assist);
	
	/**
	 * 通过Users的id更新Users中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateUsersById(Users enti);
	
	/**
	 * 通过Users的id更新Users中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullUsersById(Users enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Users中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateUsers(@Param("enti") Users value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Users中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullUsers(@Param("enti") Users value, @Param("assist") Assist assist);
}
package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.UserDevice;

import org.apache.ibatis.annotations.Param;
/**
 * UserDevice的Dao接口
 * 
 * @author 
 *
 */
public interface UserDeviceDao {

	/**
	 * 获得UserDevice数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getUserDeviceRowCount(Assist assist);
	
	/**
	 * 获得UserDevice数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<UserDevice> selectUserDevice(Assist assist);
	
	/**
	 * 获得一个UserDevice对象,以参数UserDevice对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	UserDevice selectUserDeviceObjSingle(UserDevice obj);
	
	/**
	 * 获得一个UserDevice对象,以参数UserDevice对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<UserDevice> selectUserDeviceByObj(UserDevice obj);

	/**
	 * 插入UserDevice到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertUserDevice(UserDevice value);
	
	/**
	 * 插入UserDevice中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullUserDevice(UserDevice value);
	
	/**
	 * 批量插入UserDevice到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertUserDeviceByBatch(List<UserDevice> value);
	
	/**
	 * 通过辅助工具Assist的条件删除UserDevice
	 * 
	 * @param assist
	 * @return
	 */
	int deleteUserDeviceByAssist(Assist assist);
	
	
	/**
	 * 通过辅助工具Assist的条件更新UserDevice中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateUserDevice(@Param("enti") UserDevice value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新UserDevice中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullUserDevice(@Param("enti") UserDevice value, @Param("assist") Assist assist);
}
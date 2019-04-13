package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.UserApplyDevice;

import org.apache.ibatis.annotations.Param;
/**
 * UserApplyDevice的Dao接口
 * 
 * @author 
 *
 */
public interface UserApplyDeviceDao {

	/**
	 * 获得UserApplyDevice数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getUserApplyDeviceRowCount(Assist assist);
	
	/**
	 * 获得UserApplyDevice数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<UserApplyDevice> selectUserApplyDevice(Assist assist);
	/**
	 * 通过UserApplyDevice的id获得UserApplyDevice对象
	 * 
	 * @param id
	 * @return
	 */
	UserApplyDevice selectUserApplyDeviceById(Integer id);
	
	/**
	 * 获得一个UserApplyDevice对象,以参数UserApplyDevice对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	UserApplyDevice selectUserApplyDeviceObjSingle(UserApplyDevice obj);
	
	/**
	 * 获得一个UserApplyDevice对象,以参数UserApplyDevice对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<UserApplyDevice> selectUserApplyDeviceByObj(UserApplyDevice obj);

	/**
	 * 插入UserApplyDevice到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertUserApplyDevice(UserApplyDevice value);
	
	/**
	 * 插入UserApplyDevice中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullUserApplyDevice(UserApplyDevice value);
	
	/**
	 * 批量插入UserApplyDevice到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertUserApplyDeviceByBatch(List<UserApplyDevice> value);
	/**
	 * 通过UserApplyDevice的id删除UserApplyDevice
	 * 
	 * @param id
	 * @return
	 */
	int deleteUserApplyDeviceById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除UserApplyDevice
	 * 
	 * @param assist
	 * @return
	 */
	int deleteUserApplyDeviceByAssist(Assist assist);
	
	/**
	 * 通过UserApplyDevice的id更新UserApplyDevice中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateUserApplyDeviceById(UserApplyDevice enti);
	
	/**
	 * 通过UserApplyDevice的id更新UserApplyDevice中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullUserApplyDeviceById(UserApplyDevice enti);
	
	/**
	 * 通过辅助工具Assist的条件更新UserApplyDevice中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateUserApplyDevice(@Param("enti") UserApplyDevice value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新UserApplyDevice中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullUserApplyDevice(@Param("enti") UserApplyDevice value, @Param("assist") Assist assist);
}
package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.DevicePropertiesMobile;

import org.apache.ibatis.annotations.Param;
/**
 * DevicePropertiesMobile的Dao接口
 * 
 * @author 
 *
 */
public interface DevicePropertiesMobileDao {

	/**
	 * 获得DevicePropertiesMobile数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getDevicePropertiesMobileRowCount(Assist assist);
	
	/**
	 * 获得DevicePropertiesMobile数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<DevicePropertiesMobile> selectDevicePropertiesMobile(Assist assist);
	/**
	 * 通过DevicePropertiesMobile的id获得DevicePropertiesMobile对象
	 * 
	 * @param id
	 * @return
	 */
	DevicePropertiesMobile selectDevicePropertiesMobileById(Integer id);
	
	/**
	 * 获得一个DevicePropertiesMobile对象,以参数DevicePropertiesMobile对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	DevicePropertiesMobile selectDevicePropertiesMobileObjSingle(DevicePropertiesMobile obj);
	
	/**
	 * 获得一个DevicePropertiesMobile对象,以参数DevicePropertiesMobile对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<DevicePropertiesMobile> selectDevicePropertiesMobileByObj(DevicePropertiesMobile obj);

	/**
	 * 插入DevicePropertiesMobile到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertDevicePropertiesMobile(DevicePropertiesMobile value);
	
	/**
	 * 插入DevicePropertiesMobile中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullDevicePropertiesMobile(DevicePropertiesMobile value);
	
	/**
	 * 批量插入DevicePropertiesMobile到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertDevicePropertiesMobileByBatch(List<DevicePropertiesMobile> value);
	/**
	 * 通过DevicePropertiesMobile的id删除DevicePropertiesMobile
	 * 
	 * @param id
	 * @return
	 */
	int deleteDevicePropertiesMobileById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除DevicePropertiesMobile
	 * 
	 * @param assist
	 * @return
	 */
	int deleteDevicePropertiesMobileByAssist(Assist assist);
	
	/**
	 * 通过DevicePropertiesMobile的id更新DevicePropertiesMobile中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateDevicePropertiesMobileById(DevicePropertiesMobile enti);
	
	/**
	 * 通过DevicePropertiesMobile的id更新DevicePropertiesMobile中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullDevicePropertiesMobileById(DevicePropertiesMobile enti);
	
	/**
	 * 通过辅助工具Assist的条件更新DevicePropertiesMobile中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateDevicePropertiesMobile(@Param("enti") DevicePropertiesMobile value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新DevicePropertiesMobile中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullDevicePropertiesMobile(@Param("enti") DevicePropertiesMobile value, @Param("assist") Assist assist);
}
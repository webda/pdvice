package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.DeviceProperties;

import org.apache.ibatis.annotations.Param;
/**
 * DeviceProperties的Dao接口
 * 
 * @author 
 *
 */
public interface DevicePropertiesDao {

	/**
	 * 获得DeviceProperties数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getDevicePropertiesRowCount(Assist assist);
	
	/**
	 * 获得DeviceProperties数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<DeviceProperties> selectDeviceProperties(Assist assist);
	/**
	 * 通过DeviceProperties的id获得DeviceProperties对象
	 * 
	 * @param id
	 * @return
	 */
	DeviceProperties selectDevicePropertiesById(Integer id);
	
	/**
	 * 获得一个DeviceProperties对象,以参数DeviceProperties对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	DeviceProperties selectDevicePropertiesObjSingle(DeviceProperties obj);
	
	/**
	 * 获得一个DeviceProperties对象,以参数DeviceProperties对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<DeviceProperties> selectDevicePropertiesByObj(DeviceProperties obj);

	/**
	 * 插入DeviceProperties到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertDeviceProperties(DeviceProperties value);
	
	/**
	 * 插入DeviceProperties中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullDeviceProperties(DeviceProperties value);
	
	/**
	 * 批量插入DeviceProperties到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertDevicePropertiesByBatch(List<DeviceProperties> value);
	/**
	 * 通过DeviceProperties的id删除DeviceProperties
	 * 
	 * @param id
	 * @return
	 */
	int deleteDevicePropertiesById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除DeviceProperties
	 * 
	 * @param assist
	 * @return
	 */
	int deleteDevicePropertiesByAssist(Assist assist);
	
	/**
	 * 通过DeviceProperties的id更新DeviceProperties中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateDevicePropertiesById(DeviceProperties enti);
	
	/**
	 * 通过DeviceProperties的id更新DeviceProperties中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullDevicePropertiesById(DeviceProperties enti);
	
	/**
	 * 通过辅助工具Assist的条件更新DeviceProperties中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateDeviceProperties(@Param("enti") DeviceProperties value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新DeviceProperties中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullDeviceProperties(@Param("enti") DeviceProperties value, @Param("assist") Assist assist);
}
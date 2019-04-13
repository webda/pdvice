package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.Device;

import org.apache.ibatis.annotations.Param;
/**
 * Device的Dao接口
 * 
 * @author 
 *
 */
public interface DeviceDao {

	/**
	 * 获得Device数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getDeviceRowCount(Assist assist);
	
	/**
	 * 获得Device数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Device> selectDevice(Assist assist);
	/**
	 * 通过Device的id获得Device对象
	 * 
	 * @param id
	 * @return
	 */
	Device selectDeviceById(Integer id);
	
	/**
	 * 获得一个Device对象,以参数Device对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Device selectDeviceObjSingle(Device obj);
	
	/**
	 * 获得一个Device对象,以参数Device对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Device> selectDeviceByObj(Device obj);

	/**
	 * 插入Device到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertDevice(Device value);
	
	/**
	 * 插入Device中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullDevice(Device value);
	
	/**
	 * 批量插入Device到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertDeviceByBatch(List<Device> value);
	/**
	 * 通过Device的id删除Device
	 * 
	 * @param id
	 * @return
	 */
	int deleteDeviceById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除Device
	 * 
	 * @param assist
	 * @return
	 */
	int deleteDeviceByAssist(Assist assist);
	
	/**
	 * 通过Device的id更新Device中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateDeviceById(Device enti);
	
	/**
	 * 通过Device的id更新Device中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullDeviceById(Device enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Device中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateDevice(@Param("enti") Device value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Device中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullDevice(@Param("enti") Device value, @Param("assist") Assist assist);
}
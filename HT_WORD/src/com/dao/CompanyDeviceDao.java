package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.CompanyDevice;

import org.apache.ibatis.annotations.Param;
/**
 * CompanyDevice的Dao接口
 * 
 * @author 
 *
 */
public interface CompanyDeviceDao {

	/**
	 * 获得CompanyDevice数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getCompanyDeviceRowCount(Assist assist);
	
	/**
	 * 获得CompanyDevice数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<CompanyDevice> selectCompanyDevice(Assist assist);
	/**
	 * 通过CompanyDevice的id获得CompanyDevice对象
	 * 
	 * @param id
	 * @return
	 */
	CompanyDevice selectCompanyDeviceById(Integer id);
	
	/**
	 * 获得一个CompanyDevice对象,以参数CompanyDevice对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	CompanyDevice selectCompanyDeviceObjSingle(CompanyDevice obj);
	
	/**
	 * 获得一个CompanyDevice对象,以参数CompanyDevice对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<CompanyDevice> selectCompanyDeviceByObj(CompanyDevice obj);

	/**
	 * 插入CompanyDevice到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertCompanyDevice(CompanyDevice value);
	
	/**
	 * 插入CompanyDevice中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullCompanyDevice(CompanyDevice value);
	
	/**
	 * 批量插入CompanyDevice到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertCompanyDeviceByBatch(List<CompanyDevice> value);
	/**
	 * 通过CompanyDevice的id删除CompanyDevice
	 * 
	 * @param id
	 * @return
	 */
	int deleteCompanyDeviceById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除CompanyDevice
	 * 
	 * @param assist
	 * @return
	 */
	int deleteCompanyDeviceByAssist(Assist assist);
	
	/**
	 * 通过CompanyDevice的id更新CompanyDevice中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateCompanyDeviceById(CompanyDevice enti);
	
	/**
	 * 通过CompanyDevice的id更新CompanyDevice中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullCompanyDeviceById(CompanyDevice enti);
	
	/**
	 * 通过辅助工具Assist的条件更新CompanyDevice中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateCompanyDevice(@Param("enti") CompanyDevice value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新CompanyDevice中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullCompanyDevice(@Param("enti") CompanyDevice value, @Param("assist") Assist assist);
}
package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.CompanyDeviceMobile;

import org.apache.ibatis.annotations.Param;
/**
 * CompanyDeviceMobile的Dao接口
 * 
 * @author 
 *
 */
public interface CompanyDeviceMobileDao {

	/**
	 * 获得CompanyDeviceMobile数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getCompanyDeviceMobileRowCount(Assist assist);
	
	/**
	 * 获得CompanyDeviceMobile数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<CompanyDeviceMobile> selectCompanyDeviceMobile(Assist assist);
	/**
	 * 通过CompanyDeviceMobile的id获得CompanyDeviceMobile对象
	 * 
	 * @param id
	 * @return
	 */
	CompanyDeviceMobile selectCompanyDeviceMobileById(Integer id);
	
	/**
	 * 获得一个CompanyDeviceMobile对象,以参数CompanyDeviceMobile对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	CompanyDeviceMobile selectCompanyDeviceMobileObjSingle(CompanyDeviceMobile obj);
	
	/**
	 * 获得一个CompanyDeviceMobile对象,以参数CompanyDeviceMobile对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<CompanyDeviceMobile> selectCompanyDeviceMobileByObj(CompanyDeviceMobile obj);

	/**
	 * 插入CompanyDeviceMobile到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertCompanyDeviceMobile(CompanyDeviceMobile value);
	
	/**
	 * 插入CompanyDeviceMobile中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullCompanyDeviceMobile(CompanyDeviceMobile value);
	
	/**
	 * 批量插入CompanyDeviceMobile到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertCompanyDeviceMobileByBatch(List<CompanyDeviceMobile> value);
	/**
	 * 通过CompanyDeviceMobile的id删除CompanyDeviceMobile
	 * 
	 * @param id
	 * @return
	 */
	int deleteCompanyDeviceMobileById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除CompanyDeviceMobile
	 * 
	 * @param assist
	 * @return
	 */
	int deleteCompanyDeviceMobileByAssist(Assist assist);
	
	/**
	 * 通过CompanyDeviceMobile的id更新CompanyDeviceMobile中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateCompanyDeviceMobileById(CompanyDeviceMobile enti);
	
	/**
	 * 通过CompanyDeviceMobile的id更新CompanyDeviceMobile中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullCompanyDeviceMobileById(CompanyDeviceMobile enti);
	
	/**
	 * 通过辅助工具Assist的条件更新CompanyDeviceMobile中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateCompanyDeviceMobile(@Param("enti") CompanyDeviceMobile value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新CompanyDeviceMobile中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullCompanyDeviceMobile(@Param("enti") CompanyDeviceMobile value, @Param("assist") Assist assist);
}
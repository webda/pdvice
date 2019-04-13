package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.Properties;

import org.apache.ibatis.annotations.Param;
/**
 * Properties的Dao接口
 * 
 * @author 
 *
 */
public interface PropertiesDao {

	/**
	 * 获得Properties数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getPropertiesRowCount(Assist assist);
	
	/**
	 * 获得Properties数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Properties> selectProperties(Assist assist);
	/**
	 * 通过Properties的id获得Properties对象
	 * 
	 * @param id
	 * @return
	 */
	Properties selectPropertiesById(Integer id);
	
	/**
	 * 获得一个Properties对象,以参数Properties对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Properties selectPropertiesObjSingle(Properties obj);
	
	/**
	 * 获得一个Properties对象,以参数Properties对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Properties> selectPropertiesByObj(Properties obj);

	/**
	 * 插入Properties到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertProperties(Properties value);
	
	/**
	 * 插入Properties中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullProperties(Properties value);
	
	/**
	 * 批量插入Properties到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertPropertiesByBatch(List<Properties> value);
	/**
	 * 通过Properties的id删除Properties
	 * 
	 * @param id
	 * @return
	 */
	int deletePropertiesById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除Properties
	 * 
	 * @param assist
	 * @return
	 */
	int deletePropertiesByAssist(Assist assist);
	
	/**
	 * 通过Properties的id更新Properties中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updatePropertiesById(Properties enti);
	
	/**
	 * 通过Properties的id更新Properties中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullPropertiesById(Properties enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Properties中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateProperties(@Param("enti") Properties value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Properties中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullProperties(@Param("enti") Properties value, @Param("assist") Assist assist);
}
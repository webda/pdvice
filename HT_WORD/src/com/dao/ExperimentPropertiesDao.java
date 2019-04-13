package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.ExperimentProperties;

import org.apache.ibatis.annotations.Param;
/**
 * ExperimentProperties的Dao接口
 * 
 * @author 
 *
 */
public interface ExperimentPropertiesDao {

	/**
	 * 获得ExperimentProperties数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getExperimentPropertiesRowCount(Assist assist);
	
	/**
	 * 获得ExperimentProperties数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<ExperimentProperties> selectExperimentProperties(Assist assist);
	/**
	 * 通过ExperimentProperties的id获得ExperimentProperties对象
	 * 
	 * @param id
	 * @return
	 */
	ExperimentProperties selectExperimentPropertiesById(Integer id);
	
	/**
	 * 获得一个ExperimentProperties对象,以参数ExperimentProperties对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	ExperimentProperties selectExperimentPropertiesObjSingle(ExperimentProperties obj);
	
	/**
	 * 获得一个ExperimentProperties对象,以参数ExperimentProperties对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<ExperimentProperties> selectExperimentPropertiesByObj(ExperimentProperties obj);

	/**
	 * 插入ExperimentProperties到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertExperimentProperties(ExperimentProperties value);
	
	/**
	 * 插入ExperimentProperties中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullExperimentProperties(ExperimentProperties value);
	
	/**
	 * 批量插入ExperimentProperties到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertExperimentPropertiesByBatch(List<ExperimentProperties> value);
	/**
	 * 通过ExperimentProperties的id删除ExperimentProperties
	 * 
	 * @param id
	 * @return
	 */
	int deleteExperimentPropertiesById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除ExperimentProperties
	 * 
	 * @param assist
	 * @return
	 */
	int deleteExperimentPropertiesByAssist(Assist assist);
	
	/**
	 * 通过ExperimentProperties的id更新ExperimentProperties中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateExperimentPropertiesById(ExperimentProperties enti);
	
	/**
	 * 通过ExperimentProperties的id更新ExperimentProperties中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullExperimentPropertiesById(ExperimentProperties enti);
	
	/**
	 * 通过辅助工具Assist的条件更新ExperimentProperties中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateExperimentProperties(@Param("enti") ExperimentProperties value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新ExperimentProperties中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullExperimentProperties(@Param("enti") ExperimentProperties value, @Param("assist") Assist assist);
}
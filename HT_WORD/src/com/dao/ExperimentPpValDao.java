package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.ExperimentPpVal;

import org.apache.ibatis.annotations.Param;
/**
 * ExperimentPpVal的Dao接口
 * 
 * @author 
 *
 */
public interface ExperimentPpValDao {

	/**
	 * 获得ExperimentPpVal数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getExperimentPpValRowCount(Assist assist);
	
	/**
	 * 获得ExperimentPpVal数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<ExperimentPpVal> selectExperimentPpVal(Assist assist);
	/**
	 * 通过ExperimentPpVal的id获得ExperimentPpVal对象
	 * 
	 * @param id
	 * @return
	 */
	ExperimentPpVal selectExperimentPpValById(Integer id);
	
	/**
	 * 获得一个ExperimentPpVal对象,以参数ExperimentPpVal对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	ExperimentPpVal selectExperimentPpValObjSingle(ExperimentPpVal obj);
	
	/**
	 * 获得一个ExperimentPpVal对象,以参数ExperimentPpVal对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<ExperimentPpVal> selectExperimentPpValByObj(ExperimentPpVal obj);

	/**
	 * 插入ExperimentPpVal到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertExperimentPpVal(ExperimentPpVal value);
	
	/**
	 * 插入ExperimentPpVal中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullExperimentPpVal(ExperimentPpVal value);
	
	/**
	 * 批量插入ExperimentPpVal到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertExperimentPpValByBatch(List<ExperimentPpVal> value);
	/**
	 * 通过ExperimentPpVal的id删除ExperimentPpVal
	 * 
	 * @param id
	 * @return
	 */
	int deleteExperimentPpValById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除ExperimentPpVal
	 * 
	 * @param assist
	 * @return
	 */
	int deleteExperimentPpValByAssist(Assist assist);
	
	/**
	 * 通过ExperimentPpVal的id更新ExperimentPpVal中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateExperimentPpValById(ExperimentPpVal enti);
	
	/**
	 * 通过ExperimentPpVal的id更新ExperimentPpVal中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullExperimentPpValById(ExperimentPpVal enti);
	
	/**
	 * 通过辅助工具Assist的条件更新ExperimentPpVal中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateExperimentPpVal(@Param("enti") ExperimentPpVal value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新ExperimentPpVal中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullExperimentPpVal(@Param("enti") ExperimentPpVal value, @Param("assist") Assist assist);
}
package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.ExperimentOprLog;

import org.apache.ibatis.annotations.Param;
/**
 * ExperimentOprLog的Dao接口
 * 
 * @author 
 *
 */
public interface ExperimentOprLogDao {

	/**
	 * 获得ExperimentOprLog数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getExperimentOprLogRowCount(Assist assist);
	
	/**
	 * 获得ExperimentOprLog数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<ExperimentOprLog> selectExperimentOprLog(Assist assist);
	/**
	 * 通过ExperimentOprLog的id获得ExperimentOprLog对象
	 * 
	 * @param id
	 * @return
	 */
	ExperimentOprLog selectExperimentOprLogById(Integer id);
	
	/**
	 * 获得一个ExperimentOprLog对象,以参数ExperimentOprLog对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	ExperimentOprLog selectExperimentOprLogObjSingle(ExperimentOprLog obj);
	
	/**
	 * 获得一个ExperimentOprLog对象,以参数ExperimentOprLog对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<ExperimentOprLog> selectExperimentOprLogByObj(ExperimentOprLog obj);

	/**
	 * 插入ExperimentOprLog到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertExperimentOprLog(ExperimentOprLog value);
	
	/**
	 * 插入ExperimentOprLog中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullExperimentOprLog(ExperimentOprLog value);
	
	/**
	 * 批量插入ExperimentOprLog到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertExperimentOprLogByBatch(List<ExperimentOprLog> value);
	/**
	 * 通过ExperimentOprLog的id删除ExperimentOprLog
	 * 
	 * @param id
	 * @return
	 */
	int deleteExperimentOprLogById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除ExperimentOprLog
	 * 
	 * @param assist
	 * @return
	 */
	int deleteExperimentOprLogByAssist(Assist assist);
	
	/**
	 * 通过ExperimentOprLog的id更新ExperimentOprLog中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateExperimentOprLogById(ExperimentOprLog enti);
	
	/**
	 * 通过ExperimentOprLog的id更新ExperimentOprLog中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullExperimentOprLogById(ExperimentOprLog enti);
	
	/**
	 * 通过辅助工具Assist的条件更新ExperimentOprLog中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateExperimentOprLog(@Param("enti") ExperimentOprLog value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新ExperimentOprLog中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullExperimentOprLog(@Param("enti") ExperimentOprLog value, @Param("assist") Assist assist);
}
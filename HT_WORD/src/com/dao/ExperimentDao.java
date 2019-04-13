package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.Experiment;

import org.apache.ibatis.annotations.Param;
/**
 * Experiment的Dao接口
 * 
 * @author 
 *
 */
public interface ExperimentDao {

	/**
	 * 获得Experiment数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getExperimentRowCount(Assist assist);
	
	/**
	 * 获得Experiment数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Experiment> selectExperiment(Assist assist);
	/**
	 * 通过Experiment的id获得Experiment对象
	 * 
	 * @param id
	 * @return
	 */
	Experiment selectExperimentById(Integer id);
	
	/**
	 * 获得一个Experiment对象,以参数Experiment对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Experiment selectExperimentObjSingle(Experiment obj);
	
	/**
	 * 获得一个Experiment对象,以参数Experiment对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Experiment> selectExperimentByObj(Experiment obj);

	/**
	 * 插入Experiment到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertExperiment(Experiment value);
	
	/**
	 * 插入Experiment中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullExperiment(Experiment value);
	
	/**
	 * 批量插入Experiment到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertExperimentByBatch(List<Experiment> value);
	/**
	 * 通过Experiment的id删除Experiment
	 * 
	 * @param id
	 * @return
	 */
	int deleteExperimentById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除Experiment
	 * 
	 * @param assist
	 * @return
	 */
	int deleteExperimentByAssist(Assist assist);
	
	/**
	 * 通过Experiment的id更新Experiment中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateExperimentById(Experiment enti);
	
	/**
	 * 通过Experiment的id更新Experiment中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullExperimentById(Experiment enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Experiment中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateExperiment(@Param("enti") Experiment value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Experiment中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullExperiment(@Param("enti") Experiment value, @Param("assist") Assist assist);
}
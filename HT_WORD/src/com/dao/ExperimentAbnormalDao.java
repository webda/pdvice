package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.ExperimentAbnormal;

import org.apache.ibatis.annotations.Param;
/**
 * ExperimentAbnormal的Dao接口
 * 
 * @author 
 *
 */
public interface ExperimentAbnormalDao {

	/**
	 * 获得ExperimentAbnormal数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getExperimentAbnormalRowCount(Assist assist);
	
	/**
	 * 获得ExperimentAbnormal数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<ExperimentAbnormal> selectExperimentAbnormal(Assist assist);
	/**
	 * 通过ExperimentAbnormal的id获得ExperimentAbnormal对象
	 * 
	 * @param id
	 * @return
	 */
	ExperimentAbnormal selectExperimentAbnormalById(Integer id);
	
	/**
	 * 获得一个ExperimentAbnormal对象,以参数ExperimentAbnormal对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	ExperimentAbnormal selectExperimentAbnormalObjSingle(ExperimentAbnormal obj);
	
	/**
	 * 获得一个ExperimentAbnormal对象,以参数ExperimentAbnormal对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<ExperimentAbnormal> selectExperimentAbnormalByObj(ExperimentAbnormal obj);

	/**
	 * 插入ExperimentAbnormal到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertExperimentAbnormal(ExperimentAbnormal value);
	
	/**
	 * 插入ExperimentAbnormal中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullExperimentAbnormal(ExperimentAbnormal value);
	
	/**
	 * 批量插入ExperimentAbnormal到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertExperimentAbnormalByBatch(List<ExperimentAbnormal> value);
	/**
	 * 通过ExperimentAbnormal的id删除ExperimentAbnormal
	 * 
	 * @param id
	 * @return
	 */
	int deleteExperimentAbnormalById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除ExperimentAbnormal
	 * 
	 * @param assist
	 * @return
	 */
	int deleteExperimentAbnormalByAssist(Assist assist);
	
	/**
	 * 通过ExperimentAbnormal的id更新ExperimentAbnormal中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateExperimentAbnormalById(ExperimentAbnormal enti);
	
	/**
	 * 通过ExperimentAbnormal的id更新ExperimentAbnormal中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullExperimentAbnormalById(ExperimentAbnormal enti);
	
	/**
	 * 通过辅助工具Assist的条件更新ExperimentAbnormal中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateExperimentAbnormal(@Param("enti") ExperimentAbnormal value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新ExperimentAbnormal中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullExperimentAbnormal(@Param("enti") ExperimentAbnormal value, @Param("assist") Assist assist);
}